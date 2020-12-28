/**
 * @Author:FC
 * @Date:2020/12/28
 * @Time:19:52
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.add(5,6);
        myArrayList.display();
        System.out.println();
        System.out.println(myArrayList.contains(6));
        System.out.println(myArrayList.search(6));
        System.out.println(myArrayList.getPos(5));
        myArrayList.setPos(5,99);
        myArrayList.display();
        System.out.println();
        myArrayList.remove(99);
        myArrayList.display();
        System.out.println();
        myArrayList.clear();
        myArrayList.display();
        System.out.println();

    }
}
