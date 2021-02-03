package generic;

/**
 * @Author:FC
 * @Date:2021/2/3
 * @Time:14:54
 * @Content:
 */


import java.util.ArrayList;

/**
 * 泛型：
 * 1.class MyStack<T>  表示当前类是一个泛型类
 * 2.不能实例化泛型类型的数组对象
 * 3.泛型的意义： a:可以自动进行类型的检查
 *               b:可以自动进行类型的转换
 * 4.简单类型不能做泛型的类型的参数
 * 5.泛型到底是怎么编译的？    擦除机制
 * （在语法上支持泛型，但在编译阶段会进行所谓的类型擦除）
 * （擦除为object的意义   可以放任意类型的数据）
 * 6.泛型类型的参数 不参与类型的组成
 * 7.class Algorithm<T extends Comparable<T>>  泛型的上界
 *   T类型一定要实现Comparable接口
 *   class A <E extends B>   E可以是B的子类或者是B本身
 * 8.泛型是没有下界的
 * 9.   泛型方法(是静态的)    public static<T> T findMaxVal(T[] array)
 * 10.通配符实际上也是一种泛型
 * 11.泛型一般用于读取和写入  通配符一般用于读取
 * 12. 上界 <？ extends E> 表示传入的参数？是上界E的子类或者E本身
 *      下界 <? super E> 表示传入的参数？是下界E的父类或者E本身
 * 13.ArrayList<Integer> list1和 ArrayList<Integer> list2不构成父子关系
 *
 */
class MyStack<T>{
    public T[] elem;
    public int top;

    public MyStack() {
        this.elem =(T[]) new Object[10];
    }

    public void push(T val){
        this.elem[top]=val;
        top++;
    }

    public T getTop(){
        return this.elem[top-1];
    }
}

/**
 * 写一个泛型类  找到 数组当中的最大值
 *
 */
class Algorithm<T extends Comparable<T>>{
    public T findMaxVal(T[] array){
        T max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max)>=0){
                max=array[i];
            }
        }
        return max;
    }
}


/**
 * 写一个方法打印 list当中所有的数据
 *
 */
class Test{
    public static <T> void print(ArrayList<T> list){
        for (T x:list) {
            System.out.println(x);
        }
    }
}


public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Test.print(list);
    }



    public static void main2(String[] args) {
        Algorithm<Integer> algorithm=new Algorithm<>();
        Integer[] array={1,2,3,4,5,6,7};
        System.out.println(algorithm.findMaxVal(array));
    }


    public static void main1(String[] args) {
        MyStack<Integer> myStack=new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.getTop());
    }
}
