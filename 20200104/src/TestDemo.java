/**
 * @Author:FC
 * @Date:2021/1/4
 * @Time:19:11
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(5);
        myLinkedList.display();
        myLinkedList.removeAllKey(1);
        myLinkedList.display();
    }


    public static void main8(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        myLinkedList.display();
        myLinkedList.display(myLinkedList.reverseList());
    }


    public static void main7(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        myLinkedList.display();
        System.out.println(myLinkedList.middleNode().data);
    }


    public static void main6(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        myLinkedList.display();
        System.out.println(myLinkedList.findKToTail(1).data);
        System.out.println(myLinkedList.findKToTail(5).data);


    }


    public static void main5(String[] args) {
        Node head1=new Node(1);
        Node node1=new Node(3);
        Node node2=new Node(5);
        head1.next=node1;
        node1.next=node2;

        Node head2=new Node(2);
        Node node3=new Node(4);
        Node node4=new Node(5);
        head2.next=node3;
        node3.next=node4;
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.display(myLinkedList.mergeTwoLists(head1,head2));

    }

    public static void main4(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(3);
        myLinkedList.addLast(7);
        myLinkedList.addLast(4);
        myLinkedList.addLast(8);
        myLinkedList.addLast(6);
        myLinkedList.addLast(9);
        myLinkedList.display(myLinkedList.partition(5));

    }

    public static void main3(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(1);
        myLinkedList.addLast(1);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.display(myLinkedList.deleteDuplication());

    }


    public static void main2(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        myLinkedList.display();
        System.out.println(myLinkedList.findLastNode().data);
        System.out.println(myLinkedList.findLastTwoNode().data);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.findNNode(3).data);
        System.out.println(myLinkedList.contain(1));
        myLinkedList.addFirst(0);
        myLinkedList.display();
        myLinkedList.addLast(6);
        myLinkedList.display();
        myLinkedList.addIndex(7,7);
        myLinkedList.display();
        System.out.println(myLinkedList.searchPrevNode(7).data);

    }


    public static void main1(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.display();
        myLinkedList.display(myLinkedList.deleteDuplication());

    }
}
