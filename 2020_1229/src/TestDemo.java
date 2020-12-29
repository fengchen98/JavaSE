/**
 * @Author:FC
 * @Date:2020/12/29
 * @Time:10:24
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
            System.out.println(myArrayList.contains(6));
            System.out.println(myArrayList.search(6));
            System.out.println(myArrayList.getPos(6));
            myArrayList.setPos(5,99);
            myArrayList.display();
            myArrayList.remove(99);
            myArrayList.display();
            System.out.println(myArrayList.size());
            myArrayList.clear();
            myArrayList.display();


        }
    }

