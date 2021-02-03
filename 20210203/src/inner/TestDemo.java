package inner;

/**
 * @Author:FC
 * @Date:2021/2/3
 * @Time:10:49
 * @Content:
 */

/**
 * 内部类：
 *      实例内部类：
 *      1.如何实例化内部类？
 *      外部类名.内部类名   变量=外部类对象的引用.
 *      2.内部类生成的字节码格式是   外部类$内部类.class
 *      3.在实例内部类当中不能定义静态的成员变量；如果非要定义 一定要加final
 *      4.this实际上是一个静态的成员
 *           System.out.println(OuterClass.this.data1);
 *      5.实例内部类实际上拥有两个this，一个是实例内部类自己的，一个是外部类的
 *          实例内部类是否有额外的内存开销？
 *
 *      静态内部类：1.静态内部类对象如何拿到？
 *                         OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
 *                 2.生成的字节码文件格式是   外部类$内部类.class
 *                 3.在静态内部类当中，是不可以访问外部类非静态成员的
 *
 *
 *      匿名内部类：在匿名内部类当中 使用的变量或者是常量或者在整个过程当中没有改变
 *
 *      本地内部类：在方法里面定义的类
 */
class  OuterClass{
    public void sayHello(){
        System.out.println("hello");
    }
}



//class OuterClass{
//    public int data1=1;
//    public static int data2=2;
//    static class InnerClass{
//        public OuterClass out;
//        public int data3=3;
//        public static  int data4=4;
//        public InnerClass(OuterClass out) {
//            this.out=out;
//        }
//        public void test(){
//            System.out.println("innerclass  Test");
//            System.out.println(out.data1);
//            System.out.println(data2);
//            System.out.println(data3);
//            System.out.println(data4);
//
//        }
//    }
//}




//class OuterClass{
//    public int data1=1;
//    public static int data2=2;
//    class InnerClass{
//        public int data1=11;
//        public int data3=3;
//        public static final int data4=4;
//        public InnerClass() {
//        }
//        public void test(){
//            System.out.println("innerclass  Test");
//            System.out.println(data3);
//            System.out.println(data4);
//            System.out.println(data1);
//            System.out.println(OuterClass.this.data1);
//        }
//    }
//}
public class TestDemo {
    //匿名内部类
    public static void main(String[] args) {
        int data1=1;
        new OuterClass(){
            @Override
            public void sayHello() {
                //super.sayHello();
                System.out.println("hhhhhhhhhh");
                System.out.println(data1);
            }
        }.sayHello();
    }



//    //静态内部类
//    public static void main(String[] args) {
//        OuterClass out=new OuterClass();
//        OuterClass.InnerClass innerClass=new OuterClass.InnerClass(out);
//        innerClass.test();
//    }



    //实例内部类
//    public static void main(String[] args) {
//        OuterClass out=new OuterClass();
//        OuterClass.InnerClass innerClass=out.new InnerClass();
//        innerClass.test();
//    }
}
