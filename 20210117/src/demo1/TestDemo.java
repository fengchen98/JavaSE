package demo1;
/**
 * @Author:FC
 * @Date:2021/1/17
 * @Time:10:22
 * @Content:
 */

/**
 * 1.抽象类是不可以被实例化的
 * 2.在抽象类中可以和普通类一样拥有成员变量和方法
 * 3.抽象类是可以被继承的，可以发生向上转型
 *4.当一个普通类继承的抽象类，当前普通类一定要重写抽象类当中的抽象方法
 *5.当普通类继承了抽象类且不想实现抽象类中的抽象方法时，将该普通类修改
 * 为抽象类，此时也可以实现抽象方法
 *6.抽象方法不能是私有的
 * 7.抽象类最大的意义就是被继承
 *
 */
abstract class shape{
    public abstract void draw();
}

class Rect extends shape{
    @Override
    public void draw() {
        System.out.println("▬");
    }
}

class Circle extends shape{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}
public class TestDemo {
    public static void main(String[] args) {

    }
}
