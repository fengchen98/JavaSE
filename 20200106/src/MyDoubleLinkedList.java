/**
 * @Author:FC
 * @Date:2021/1/8
 * @Time:20:29
 * @Content:
 */
class ListNode1{
    public int val;
    public ListNode1 prev;
    public ListNode1 next;

    public ListNode1(int val) {
        this.val = val;
    }
}
public class MyDoubleLinkedList {
    public  ListNode1 head=new ListNode1(-1);
    public  ListNode1 last;

    public void display(){
        ListNode1 cur=head.next;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public void addFirst(int val){
        ListNode1 node=new ListNode1(val);
        if (this.head.next==null){
            node.prev=head;
            head.next=node;
            last=node;
            return;
        }
        head.next.prev=node;
        node.next=head.next;
        head.next=node;
        node.prev=head;
    }

    public void addLast(int val){
        ListNode1 node=new ListNode1(val);
        if (this.head.next==null){
            node.prev=head;
            head.next=node;
            last=node;
            return;
        }
        last.next=node;
        node.prev=last;
        last=node;
    }

    public int size() {
        ListNode1 cur = this.head.next;
        int count = 0;
        while (cur != null) {
            count ++;
            cur = cur.next;
        }
        return count;
    }

    public void addIndex(int index,int val){
        ListNode1 node=new ListNode1(val);
        if (index<0||index>size()){
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
        ListNode1 cur=head.next;
        while (index!=0){
            cur=cur.next;
            index--;
        }
        node.next=cur;
        node.prev=cur.prev;
        node.prev.next=node;
        cur.prev=cur;

    }

    public boolean contains(int key){
        ListNode1 cur=this.head.next;
        while (cur!=null){
            if (cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    public ListNode1 findNode(int key){
        ListNode1 cur=this.head.next;
        while (cur!=null){
            if (cur.val==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }


    public void remove(int key) {
        ListNode1 cur = this.head.next;
        if (last.val == key) {
            last = last.prev;
            last.next = null;
            return;
        }
        while (cur.next != null) {
            if (cur.val == key) {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                return;
            }
            cur = cur.next;
        }
    }


        public void removeAllKey(int key){
            ListNode1 cur = this.head.next;
            if (last.val == key) {
                last = last.prev;
                last.next = null;
            }
            while (cur.next != null) {
                if (cur.val == key) {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;

                }
                cur = cur.next;
            }

        }

    public void clear(){
        this.head.next=null;
        this.last=null;
    }


    }


