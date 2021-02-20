package map_set;

/**
 * @Author:FC
 * @Date:2021/2/5
 * @Time:11:52
 * @Content:
 */
public class HashBuck {
    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node[] array;
    public int usedSize;

    public HashBuck(){
        this.array=new Node[8];
    }

    public double loadFactor(){
        return this.usedSize*1.0/this.array.length;
    }

    //超过负载因子需要扩容
    public void resize(){
        Node[] newArray=new Node[2*array.length];
        for (int i = 0; i < array.length; i++) {
            Node cur=array[i];
            while (cur!=null){
                int index=cur.key%newArray.length;
                Node curNext=cur.next;
                cur.next=newArray[index];
                newArray[index]=cur;
                cur=curNext;
            }
        }
        array=newArray;
    }

    public void push(int key,int val){
        Node node=new Node(key,val);
        int index=key%array.length;
        Node cur=array[index];
        while (cur!=null){
            if (cur.key==key){
                cur.val=val;
                return;
            }
            cur=cur.next;
        }
        //开始头插法   jdk1.8 是尾插法
        node.next=array[index];
        array[index]=node;
        this.usedSize++;
        if (loadFactor()>0.75){
            resize();
        }
    }

    public int get(int key){
        int index=key%array.length;
        Node cur=array[index];
        while (cur!=null){
            if (cur.key==key){
                return cur.val;
            }
            cur=cur.next;
        }
        return -1;
    }


    public static void main(String[] args) {
        HashBuck hashBuck=new HashBuck();
        hashBuck.push(1,1);
        hashBuck.push(2,2);
        hashBuck.push(10,10);
        hashBuck.push(4,4);
        hashBuck.push(5,5);
        hashBuck.push(6,6);
        hashBuck.push(7,7);
        System.out.println(hashBuck.get(6));
    }
}
