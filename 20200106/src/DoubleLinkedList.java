/**
 * @Author:FC
 * @Date:2021/1/8
 * @Time:11:26
 * @Content:
 */
class ListNode{
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val) {
        this.val = val;
    }

}
public class DoubleLinkedList {
    public ListNode head;
    public ListNode last;

    public void display(){
        ListNode cur=head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public void addFirst(int val){
        ListNode listNode=new ListNode(val);
        if (this.head==null){
            head=listNode;
            last=listNode;
        }else {
            listNode.next=head;
            head.prev=listNode;
            head=listNode;
        }

    }

    public void addLast(int val){
        ListNode listNode=new ListNode(val);
        if (this.head==null){
            head=listNode;
            last=listNode;
        }else {
            last.next=listNode;
            listNode.prev=last;
            last=listNode;
        }

    }


    public int size(){
        int count=0;
        ListNode cur=this.head;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        return count;

    }


    public void addIndex(int index,int val){
        ListNode node=new ListNode(val);
        if (index<0){
            return;
        }
        if (index==0){
            addFirst(val);
            return;
        }
        if (index==size()){
            addLast(val);
            return;
        }

        if (this.head==null){
            head=node;
            last=node;
        }else {

            ListNode cur = head;
            while (0 != index) {
                cur = cur.next;
                index--;
            }
            node.next = cur;
            node.prev = cur.prev;
            cur.prev.next = node;
            cur.prev = node;
        }

    }

    public boolean contains(int key){
        ListNode cur=this.head;
        while (cur!=null){
            if (cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    public ListNode findNode(int key){
        ListNode cur=this.head;
        while (cur!=null){
            if (cur.val==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }


    public void remove(int key){
        ListNode cur=findNode(key);
        if (cur==null){
            return;
        }
        if (cur==head){
            head=head.next;
            head.prev=null;
            return;
        }
        if (cur==last){
            last=last.prev;
            last.next=null;
            return;
        }
        cur.prev.next=cur.next;
        cur.next.prev=cur.prev;

    }


    public void removeAllKey(int key){
        ListNode cur=this.head;
        while (cur!=null){
            if (cur.val==key){
                if (cur==this.head){
                    this.head=this.head.next;
                    head.prev=null;
                }else if (cur==last){
                    last=last.prev;
                    last.next=null;
                }else {
                    cur.prev.next=cur.next;
                    cur.next.prev=cur.prev;
                }
            }
                cur=cur.next;

        }
    }

    public void clear(){
        this.head=null;
        this.last=null;
    }

}
