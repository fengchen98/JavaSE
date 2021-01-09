/**
 * @Author:FC
 * @Date:2021/1/6
 * @Time:11:45
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

        //初始化节点
        public void createNode(){
            this.head=new Node(3);
            Node node1=new Node(2);
            Node node2=new Node(1);
            Node node3=new Node(4);
            Node node4=new Node(5);
            this.head.next=node1;
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            node4.next=node1;
        }

        //显示所有节点
        public void display(){
            Node cur=this.head;
            while (cur!=null){
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }

        public void display(Node head){
            Node cur=head;
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

        // //找到链表的第N个节点
        public Node findNNode(int n){
            if (n<=0||n>size()){
                return null;
            }
            Node cur=this.head;
            int count=1;
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
                node.next=this.head;
                this.head=node;
            }
        }

        //尾插法
        public void addLast(int data) {
            Node node = new Node(data);
            if (this.head == null) {
                this.head = node;
            } else {
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
            int count=0;
            Node cur=this.head;
            while (count!=index-1){
                cur=cur.next;
                count++;
            }
            node.next=cur.next;
            cur.next=node;

        }

        //找前驱节点
        public Node searchPrevNode(int key) {
            if (this.head == null) {
                return null;
            }
            Node cur = this.head;
            while (cur.next != null) {
                if (cur.next.data == key) {
                    return cur;
                }
                cur = cur.next;
            }
            return null;
        }

        //删除第一次出现关键字为key的节点
        public void remove(int key) {
            if (this.head == null) {
                return;
            }

            if (this.head.data == key) {
                this.head = this.head.next;
            }

            Node cur = searchPrevNode(key);
            if (cur == null) {
                return;
            }
            cur.next = cur.next.next;
        }

        //删除所有值为key的节点
        public void removeAllKey(int key){
            if (this.head == null) {
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
            Node pre=null;
            Node newHead=null;
            while (cur!=null){
                Node curNext=cur.next;
                if (curNext==null){
                    newHead=cur;
                }
                cur.next=pre;
                pre=cur;
                cur=curNext;
            }
            return newHead;
        }

        //找到中间节点
        public Node middleNode(){
            Node fast=this.head;
            Node slow=this.head;
            while (fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }

        //输入一个链表，输出该链表中倒数第k个结点
        public Node findKToTail(int k){
            if (this.head==null){
                return null;
            }
            if (k<0||k>size()){
                return null;
            }
            Node cur=this.head;
            int count=0;
            while (count!=(size()-k)){
                cur=cur.next;
                count++;
            }
            return cur;

        }

        //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
        public Node mergeTwoLists(Node node1,Node node2) {
            Node newHead=new Node(0);
            Node cur=newHead;
            while (node1!=null&&node2!=null) {
                if (node1.data < node2.data) {
                    cur.next=node1;
                    cur=cur.next;
                    node1=node1.next;
                } else {
                    cur.next=node2;
                    cur=cur.next;
                    node2=node2.next;
                }
            }
            if (node1==null){
                cur.next=node2;
            }  else {
                cur.next=node1;
            }
            return newHead.next;
        }

        //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
        public Node partition( int x) {
            Node as=null;
            Node ae=null;
            Node bs=null;
            Node be=null;
            Node cur=this.head;
            while (cur!=null){
                if (cur.data<x){
                    if (bs==null){
                        bs=cur;
                        be=cur;
                    } else {
                        be.next=cur;
                        be=be.next;
                    }
                }   else {
                    if (as == null) {
                        as=cur;
                        ae=cur;

                    }  else {
                        ae.next=cur;
                        ae=ae.next;
                    }
                }
                cur=cur.next;
            }
            if (bs==null){
                return as;
            }
            be.next=as;
            if (ae!=null){
                ae.next=null;
            }
            return bs;
        }

        //判断其是否为回文结构。
        public boolean chkPalindrome() {
            if(this.head==null){
                return false;
            }
            if(this.head.next==null){
                return true;
            }
            Node slow=this.head;
            Node fast=this.head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            Node cur=slow.next;
            Node prev=slow;
            while(cur!=null){
                Node curNext=cur.next;
                cur.next=prev;
                prev=cur;
                cur=curNext;
            }

            cur=this.head;
            Node cur2=prev;
            while(cur!=cur2){
                if(cur.data==cur2.data){
                    if(cur.next==cur2){
                        return true;
                    }
                    cur=cur.next;
                    cur2=cur2.next;
                }else{
                    return false;
                }
            }
            return true;

        }




        //找到两个单链表相交的起始节点
        public Node getIntersectionNode1(Node headA, Node headB) {
            if(headA==null||headB==null){
                return null;
            }
            Node pA=headA;
            Node pB=headB;
            while(pA!=pB){
                if(pA==null){
                    pA=headB;
                }else{
                    pA=pA.next;
                }

                if(pB==null){
                    pB=headA;
                }else{
                    pB=pB.next;
                }
            }
            return pA;

            }


        public boolean hasCycle(){
            if (this.head==null){
                return false;
            }
            Node fast=this.head;
            Node slow=this.head;
            while(fast!=null&&fast.next!=null){

                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    break;
                }
            }
            if(fast==null||fast.next==null){
                return false;
            }
            return true;
        }

        public Node detectCycle(){
            if (this.head==null){
                return null;
            }
            Node fast=this.head;
            Node slow=this.head;
            while(fast!=null&&fast.next!=null){

                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    break;
                }
            }
            if(fast == null || fast.next == null) {
                return null;
            }

            slow=this.head;
            while (slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
        }


    }

