/**
 * @Author:FC
 * @Date:2020/12/31
 * @Time:10:04
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

    //初始化链表
    public void creatNode(){
        this.head=new Node(1);
        Node node1=new Node(2);
        Node node2=new Node(3);
        Node node3=new Node(4);
        Node node4=new Node(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
    }

    //打印节点信息
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //找到最后一个节点
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

    //找到倒数第二个节点
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

    //计算链表中元素的个数
    public int size(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //找到链表的第N个节点
    public Node findNNode(int n){
        if (n<=0||n>size()){
            return null;
        }
        int count=1;
        Node cur=this.head;
        while (count!=n){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    //找到链表中是否包含某个元素
    public boolean contain(int key){
        if (this.head==null){
            return false;
        }
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
        }else {
            Node cur = findLastNode();
            cur.next = node;
        }
    }

    //插入到下标为index位置
    public void addIndex(int index,int data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
        }
        if (index==0){
            addFirst(data);
            return;
        }
        if (index==size()-1){
            addLast(data);
            return;
        }
        Node cur=this.head;
        int count=0;
        while (count!=index-1){
            cur=cur.next;
            count++;
        }
        node.next=cur.next;
        cur.next=node;
    }

    //找前驱节点
    public Node searchPrevNode(int key){
        if (this.head==null){
            return null;
        }
        Node cur=this.head;
        while (cur.next!=null){
            if (cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head==null){
            return;
        }
        if (this.head.data==key){
            this.head=head.next;
            return;
        }
        Node cur=searchPrevNode(key);
        if (cur==null){
            return;
        }
        cur.next=cur.next.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head==null){
            return;
        }
        Node cur=this.head.next;
        Node pre=this.head;
        while (cur!=null){
            if (cur.data==key){
                pre.next=cur.next;
                cur=cur.next;
            }else {
                pre=cur;
                cur=cur.next;
            }
        }
        if (this.head.data==key){
            this.head=this.head.next;
        }
    }

    public void clear(){
        this.head=null;
    }

    public Node reverseList(){
        Node cur=this.head;
        Node prev=null;
        Node newHead=null;
        while (cur!=null){
            Node curNext=cur.next;
            if (curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }

    public Node middleNode1(){
        if (this.head==null){
            return null;
        }
        int len=size()/2;
        Node cur=this.head;
        int count=0;
        while (count!=len){
            cur=cur.next;
            count++;
        }
        return cur;

    }

    //找到中间节点
    public Node middleNode(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }







}
