/**
 * @Author:FC
 * @Date:2021/1/1
 * @Time:16:13
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        myLinkedList.display();
        Node ret=myLinkedList.partition(2);
        System.out.println(ret.data);
    }
    public static void main2(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        Node head1=new Node(4);
        Node node1=new Node(3);
        Node node2=new Node(6);
        head1.next=node1;
        node1.next=node2;

        Node head2=new Node(2);
        Node node3=new Node(4);
        Node node4=new Node(5);
        head2.next=node3;
        node3.next=node4;

        Node ret=myLinkedList.mergeTwoLists(head1,head2);
        System.out.println(ret.data);
    }
    public static void main1(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        myLinkedList.display();
        System.out.println(myLinkedList.findLastNode().data);
        System.out.println(myLinkedList.findLastTwoNode().data);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contain(5));
        myLinkedList.addFirst(0);
        myLinkedList.display();
        myLinkedList.addLast(6);
        myLinkedList.display();
        myLinkedList.addFirst(-1);
        myLinkedList.display();
        myLinkedList.addLast(7);
        myLinkedList.addLast(7);

        myLinkedList.display();
        myLinkedList.addIndex(4,99);

        myLinkedList.display();
        System.out.println(myLinkedList.searchPrevNode(3).data);
        myLinkedList.remove(99);
        myLinkedList.display();
        myLinkedList.removeAllKey(7);
        myLinkedList.display();
        //System.out.println(myLinkedList.reverseList().data);
        System.out.println(myLinkedList.middleNode().data);
        System.out.println(myLinkedList.findKToTail(1).data);


    }
}
