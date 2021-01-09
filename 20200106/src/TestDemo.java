/**
 * @Author:FC
 * @Date:2021/1/6
 * @Time:11:45
 * @Content:
 */
public class TestDemo {
    public static Node getIntersectionNode(Node headA, Node headB){
        if (headA==null||headB==null){
            return null;
        }
        int lenA=0;
        int lenB=0;
        Node pl=headA;
        Node ps=headB;
        while (pl!=null){
            pl=pl.next;
            lenA++;
        }
        while (ps!=null){
            ps=ps.next;
            lenB++;
        }
        pl=headA;
        ps=headB;
        int len=lenA-lenB;
        if (len<0){
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }
        while (len!=0){
            pl=pl.next;
            len--;
        }
        while (pl!=ps){
            pl=pl.next;
            ps=ps.next;
        }
        return pl;

    }


    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList=new MyDoubleLinkedList();
        myDoubleLinkedList.addFirst(1);
        myDoubleLinkedList.addFirst(2);
        myDoubleLinkedList.addFirst(3);
        myDoubleLinkedList.display();
        myDoubleLinkedList.addLast(1);
        myDoubleLinkedList.addLast(2);
        myDoubleLinkedList.addLast(3);
        myDoubleLinkedList.display();
        System.out.println(myDoubleLinkedList.size());
        myDoubleLinkedList.addIndex(6,99);
        myDoubleLinkedList.display();
        myDoubleLinkedList.remove(99);
        myDoubleLinkedList.display();
        myDoubleLinkedList.removeAllKey(3);
        myDoubleLinkedList.display();
        myDoubleLinkedList.clear();
        myDoubleLinkedList.display();



    }


    public static void main8(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        Node ret=myLinkedList.detectCycle();
        System.out.println(ret.data);
    }


    public static void main7(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createNode();
        System.out.println(myLinkedList.hasCycle());
    }

    public static void main6(String[] args) {
        Node head1=new Node(1);
        Node node1=new Node(2);
        Node node2=new Node(3);
        head1.next=node1;
        node1.next=node2;
        Node head2=new Node(4);
        head2.next=node1;
        Node ret=getIntersectionNode(head1,head2);
        System.out.println(ret.data);
    }

    public static void main5(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(2);
        myLinkedList.addLast(1);

        System.out.println(myLinkedList.chkPalindrome());
    }

    public static void main4(String[] args) {
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.display();
        doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(4);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(8,99);
        doubleLinkedList.display();
        doubleLinkedList.remove(99);
        doubleLinkedList.display();
        doubleLinkedList.removeAllKey(1);
        doubleLinkedList.display();



    }


    public static void main3(String[] args) {
        MyLinkedList myLinkedList1=new MyLinkedList();
        myLinkedList1.addLast(4);
        myLinkedList1.addLast(1);
        myLinkedList1.addLast(8);
        myLinkedList1.addLast(4);
        myLinkedList1.addLast(5);

        MyLinkedList myLinkedList2=new MyLinkedList();
        myLinkedList2.addLast(5);
        myLinkedList2.addLast(0);
        myLinkedList2.addLast(1);
        myLinkedList2.addLast(8);
        myLinkedList2.addLast(4);
        myLinkedList2.addLast(5);

        Node ret=getIntersectionNode(myLinkedList1.head, myLinkedList2.head);
        System.out.println(ret.data);

    }


//    public static void main2(String[] args) {
//        MyLinkedList myLinkedList=new MyLinkedList();
//        Node headA=new Node(0);
//        Node node1=new Node(9);
//        Node node2=new Node(1);
//        Node node3=new Node(2);
//        Node node4=new Node(4);
//        headA.next=node1;
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//
//        Node headB=new Node(3);
//        Node node5=new Node(2);
//        Node node6=new Node(4);
//
//        headB.next=node5;
//        node5.next=node6;
//
//        System.out.println(getIntersectionNode(headA, headB));
//
//    }
//
//
//    public static void main1(String[] args) {
//        MyLinkedList myLinkedList=new MyLinkedList();
//
//        myLinkedList.addLast(1);
//        myLinkedList.addLast(2);
//        myLinkedList.addLast(2);
//        myLinkedList.addLast(1);
//
//        System.out.println(myLinkedList.chkPalindrome());
//    }

}
