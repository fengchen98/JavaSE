/**
 * @Author:FC
 * @Date:2020/12/30
 * @Time:18:05
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createLinked();
        myLinkedList.display();
        myLinkedList.addFirst(0);
        myLinkedList.display();
        myLinkedList.addLast(6);
        myLinkedList.display();
        myLinkedList.addIndex(0,-1);
        myLinkedList.display();
        myLinkedList.addIndex(2,1);
        myLinkedList.display();
        myLinkedList.addIndex(9,7);
        myLinkedList.display();
        myLinkedList.addIndex(11,7);
        myLinkedList.display();

    }
}
