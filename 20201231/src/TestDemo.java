/**
 * @Author:FC
 * @Date:2020/12/31
 * @Time:10:03
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.creatNode();
        myLinkedList.display();
        System.out.println(myLinkedList.findLastNode().data);
        System.out.println(myLinkedList.findLastTwoNode().data);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.findNNode(2).data);
        System.out.println(myLinkedList.contain(3));
        myLinkedList.addFirst(0);
        myLinkedList.addFirst(-1);
        myLinkedList.addFirst(-1);

        myLinkedList.display();
        myLinkedList.addLast(6);
        myLinkedList.addLast(7);
        myLinkedList.addLast(7);
        myLinkedList.display();
        myLinkedList.addIndex(4,99);
        myLinkedList.display();
        myLinkedList.remove(99);
        myLinkedList.display();
        myLinkedList.removeAllKey(100);
        myLinkedList.display();
        System.out.println(myLinkedList.reverseList().data);



    }
}
