/**
 * @Author:FC
 * @Date:2021/1/20
 * @Time:9:12
 * @Content:
 */



/**
 * String StringBuilder  StringBuffer区别
 *  1.后两者包含了一些String没有的方法
 *  2.后两者是可变的，Sting是不可变的，String的每次拼接都会产生新的对象，而后两者返回的都是this
 *  3.StringBuilder  StringBuffer区别：
 *  StringBuilder和String出现在单线程，StringBuffer出现在多线程情况
 *  4.StringBuilder和String的区别：
 *      String的拼接会被优化为StringBuilder.append方法
 *
 */
public class TestDemo {
    public static void main(String[] args) {
        String str="abc";
        StringBuilder sb=new StringBuilder();
        sb.append(str);

        for (int i = 0; i <10 ; i++) {
            str= sb.append(i).toString();
        }
        System.out.println(str);
    }

    public static void main6(String[] args) {
        String string="abcdef";
        StringBuilder sb=new StringBuilder("abcde");
        System.out.println(sb.append("hello"));
        StringBuffer sb2=new StringBuffer();
    }



    public static void main5(String[] args) {
        String str1=null;
        String str2="";
        System.out.println(str2.isEmpty());
    }


    public static void main4(String[] args) {
        String string="    a  s aAas dA d as     ";
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
    }


    public static void main3(String[] args) {
        String string="    a  s adas da d as     ";
        System.out.println(string);
        System.out.println(string.trim());
    }


    public static void main2(String[] args) {
        String str="192.168.1.1";
        String[] strings=str.split("\\.");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void main1(String[] args) {
        String string="uesename=zhangsan&password=123";
        String[] strings=string.split("&",2);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
