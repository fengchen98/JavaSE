/**
 * @Author:FC
 * @Date:2021/1/11
 * @Time:18:43
 * @Content:
 */

class Animal{
    public String name;
    public int age;

    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(this.name+"eat");
    }
}

class Dog extends Animal{
    public int leg;

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println(this.name+"eat");
    }

    public void wangwang(){
        System.out.println("wangwang!!!");
    }
}

class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println(this.name+"eat");
    }
    public void fly(){
        System.out.println(this.name+"fly");
    }
}

public class TestDemo{
    public static void func(Animal animal){

    }
    //3.返回值传参
    public static Animal func2(){
        return new Dog();
    }

    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.name="旺财";
        animal.eat();
    }

    public static void main2(String[] args) {
        //向下转型
        Animal animal=new Dog();
        Dog dog=(Dog)animal;
        dog.wangwang();
        //向下转换是不安全的
        //A instanceof B  代表A是否是B的实例
        Animal animal1=new Dog();
        if (animal1 instanceof Bird){
            Bird bird=(Bird) animal;
            bird.fly();
        }

    }

    public static void main1(String[] args){
        Dog dog=new Dog();
        dog.wangwang();
        //向上转型:父类的引用引用子类的对象
        //1.直接赋值
        Animal animal=new Dog();
        //2.方法传参
        func(new Dog());
        //animal调用的都是Animal所拥有的
        //animal.wangwang();
        animal.name="ghh";
        //animal.leg=4;


    }
    }


