package demo2;

/**
 * @Author:FC
 * @Date:2021/1/17
 * @Time:10:44
 * @Content:
 */

/**
 * 1.接口当中的方法不能有具体实现
 * 接口当中的方法默认是：public abstract
 * 2.接口当中的成员变量默认是：public static final
 * 3.default修饰的方法可以有具体的实现
 * 4.接口不能实例化的
 * 5.类和接口之间的关系：implements
 * 6.一个类可以实现多个接口
 * 7.一个类可以继承一个类同时实现多个接口
 * 8.接口可以扩展多个接口
 * 9.接口的出现就是为了解决多继承的问题
 *
 */
interface Ishape{
    //public static final int age=10;
    //public abstract void draw();
//    default void func(){
//        System.out.println("hahahah");
//    }
    void draw();
}

class Rect implements Ishape{
    @Override
    public void draw() {
        System.out.println("▬");
    }
}

class Circle implements Ishape{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}


public class TestDemo {
    public static void drawMap(Ishape ishape){
        ishape.draw();
    }
    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Circle());
    }
}
