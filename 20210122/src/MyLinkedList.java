/**
 * @Author:FC
 * @Date:2021/1/22
 * @Time:16:30
 * @Content:
 */

public class MyLinkedList <T>{
    class Node{
        public T val;
        public Node next;

        public Node() {

        }

        public Node(T val) {
            this.val = val;
        }
    }
    public Node head=new Node();

    public void display(){
        Node cur=head.next;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //头插
    public void addFirst(T data){
        Node node=new Node(data);
        node.next=head.next;
        head.next=node;
    }

    //尾插
    public void add(T data){
        Node node=new Node( data);
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
}
