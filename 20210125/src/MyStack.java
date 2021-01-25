import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author:FC
 * @Date:2021/1/25
 * @Time:14:29
 * @Content:  用队列实现栈
 */

public class MyStack {
    private Queue<Integer> queue1=new LinkedList<>();
    private Queue<Integer> queue2=new LinkedList<>();

    public MyStack(){

    }

    public void push(int x){
        queue2.offer(x);
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue tmp=queue1;
        queue1=queue2;
        queue2=tmp;
    }

    public int pop(){
        return queue1.poll();
    }

    public int top(){
        return queue1.peek();
    }

    public boolean empty(){
        return queue1.isEmpty();
    }

}
