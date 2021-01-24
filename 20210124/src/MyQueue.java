/**
 * @Author:FC
 * @Date:2021/1/24
 * @Time:9:48
 * @Content:
 */
class Node{
    public int val;
    public Node next;

    public Node(){

    }

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    public Node first;   //队头
    public Node last;    //队尾

    public boolean offer(int val){
        Node node=new Node(val);
        if (this.first==null){
            this.first=node;
            this.last=node;
        }else {
            this.last.next=node;
            this.last=node;
        }
        return true;
    }

    public boolean isEmpty(){
        if (this.first==null&&this.last==null){
            return true;
        }
        return false;
    }

    //得到队头元素且删除
    public int poll(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int ret=this.first.val;
        this.first=this.first.next;
        return ret;
    }

    //得到队头元素且不删除
    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return this.first.val;
    }
}
