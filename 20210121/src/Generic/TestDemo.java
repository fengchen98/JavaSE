package Generic;

/**
 * @Author:FC
 * @Date:2021/1/21
 * @Time:9:30
 * @Content:
 */

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型：只存在编译时期，是编译时期的一种机制
 *    意义：1.会自动进行类型检查
 *         2.自动进行强制转换
 *         泛型再编译的时候并不会进行指定类型的替换，而是拿指定类型进行检查
 *         编译的时候会进行类型擦除，会把泛型擦除为objec
 *
 * 1.<T>代表占位符，表示当前这个类是泛型类
 * 2.简单类型不能做泛型类型的参数
 * 3.不能new一个泛型类型的数组
 *
 *
 */
class MyArrayList<T>{
    public T[] elem;
    public int usedSize;

    public MyArrayList(){
        this.elem=(T[])new Object[10];
    }

    public void add(T data){
        elem[usedSize]=data;
        usedSize++;
    }

    public T get(int pos){
        return this.elem[pos];
    }
}

class Student<T>{
    public String name;
    public String className;
    public Double score;

    public Student(String name, String className, Double score) {
        this.name = name;
        this.className = className;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
    }


    public static void main6(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("fc","1",88.8));
        list.add(new Student("xx","1",98.8));
        System.out.println(list);
    }



    /**
     *ArrayList底层是一个数组，每次放元素的时候都放在了最后
     *
     */
    public static void main5(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);//1 2 3 4 5

        //迭代器  用来打印集合中的元素
        Iterator<Integer> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //慎用iterator.remove();
        iterator.remove(); //删除的是最后结束时iterator指向的
        System.out.println(arrayList);


//        List<Integer> list=new ArrayList<>();
//        list=arrayList.subList(1,3); //发生的是浅拷贝
//        System.out.println(list);  //2 3
//        list.set(0,99);
//        System.out.println(list);  //99 3
//        System.out.println(arrayList);  //1 99 3 4 5


    }


    public static void main4(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
    }




    /**
     * 装包/装箱：把简单类型包装成对应的包装类
     *     自动装包：
     *     显示装包：
     * 拆包/拆箱：把包装类变为简单类型
     *     自动拆箱：
     *     显示拆箱：
     */
    public static void main3(String[] args) {
        Integer integer=10;
        int a=integer;   //自动拆箱    intValue方法
        System.out.println(a);
        int a2= integer.intValue();   //显示拆箱
        System.out.println(a2);
        double d= integer.doubleValue();
        System.out.println(d);

    }


    public static void main2(String[] args) {
        int a=10;
        Integer integer=new Integer(a);   //显示装包
        System.out.println(integer);
        Integer integer1=Integer.valueOf(a);  //显示装包
        System.out.println(integer1);

        Integer integer2=a;
        System.out.println(integer2);  //自动装包  其实也是调用了Integer.valueOf方法



    }

    public static void main1(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("hello");
        String str=(String)myArrayList.get(1);
        System.out.println(str);
    }
}
