/**
 * @Author:FC
 * @Date:2020/12/30
 * @Time:19:17
 * @Content:
 */
class Node{
    public int data;
    public Node next;

    public Node(){

    }

    public Node(int data){
        this.data=data;
    }
}

public class MyLinkedList {
    public Node head;
    public void createLinked(){
        this.head=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        this.head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

    }

    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public Node findLastNode(){
        if (this.head==null){
            return null;
        }
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        return cur;
    }

    public Node findLastTwoNode(){
        if (this.head==null){
            return null;
        }
        if (this.head.next==null){
            return null;
        }
        Node cur=this.head;
        while (cur.next.next!=null){
            cur=cur.next;
        }
        return cur;
    }

    public int size(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
           count++;
           cur=cur.next;
        }
        return count;
    }

    public Node findN(int n){
        if (this.head==null){
            return null;
        }
        if (n<=0){
            return null;
        }
        if (n>size()){
            return null;
        }
        int count=0;
        Node cur=this.head;
        while (count!=n){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                return  true;
            }
            cur=cur.next;
        }
        return false;
    }

    //头插法
    public void addFirst(int data){
//        Node node=new Node(data);
//        if (this.head==null){
//            this.head=node;
//        }else {
//            node.next=this.head;
//            this.head=node;
//        }
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;
    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
        }else {
            Node cur=findLastNode();
            cur.next=node;
        }
    }

    public void addIndex(int index,int key){
        if (index<0||index>size()){
            System.out.println("index 不合法！");
            return;
        }

        if (index==0){
            addFirst(key);
            return;
        }

        if (index==size()){
            addLast(key);
            return;
        }

        int count=0;
        Node cur=this.head;
        Node node=new Node(key);
        while (count!=index-1){
            count++;
            cur=cur.next;
        }
        node.next=cur.next;
        cur.next=node;

    }

}
