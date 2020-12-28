import java.util.Arrays;

class Student{
    private String name;
    private int age;

    //默认构造函数
    public Student() {
        //可以使用this调用构造函数
        this("fc",23);//必须将此行代码放到第一行
        System.out.println("我是构造函数");
    }

    //带有两个参数的构造函数
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //实例代码块
    {
        System.out.println("我是实例代码块");
    }

    //静态代码块
    static{
        System.out.println("我是静态代码块");
    }

    public void eat(){
        System.out.println("学生吃饭！");
    }

    public void sleep(){
        System.out.println("学生睡觉！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



class Person{
    public String name;  //实例成员变量
    public int age;
    public static int COUNT;   //静态成员变量，属于类本身，只有一份，存在方法区
    public final int SIZE=10;  //被final修饰的常量属于对象，后续不能被修改
    public final static int SIZE1=100;  //静态常量，属于类本身，只有一份且后续不能被修改

    //实例成员方法
    public void eat(){
        System.out.println("人吃饭！");
    }

    public void sleep(){
        System.out.println("人睡觉！");
    }

    //静态方法
    public static void change(){
        COUNT=100;
    }

}
public class TestDemo {
    public static void main(String[] args) {
        Student student=new Student();
    }



    public static void main5(String[] args) {
        Student student=new Student("张三",10);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student);
    }



    public static void main4(String[] args) {
        Student student=new Student();
        student.setAge(10);
        System.out.println(student.getAge());
        student.setName("zhangsan");
        System.out.println(student.getName());

    }




    public static void main3(String[] args) {
        Person person=new Person();
        person.age++;
        Person.COUNT++;
        System.out.println(person.age);
        System.out.println(Person.COUNT);
        System.out.println("=============");
        Person person1=new Person();
        person1.age++;
        Person.COUNT++;
        System.out.println(person.age);
        System.out.println(Person.COUNT);

    }



    //给定两个整型数组, 交换两个数组的内容.
    public static void swap(int[]arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            int temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
    }
    public static void main2(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        System.out.println("交换前");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        swap(arr1,arr2);
        System.out.println("交换后");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }



    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int left=0;
        int right=arr.length-1;
        while (left<right){
            while (left<right&&arr[left]%2==0){
                left++;
            }
            while (left<right&&arr[right]%2==1){
                right--;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
