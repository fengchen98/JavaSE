import java.util.Stack;

/**
 * @Author:FC
 * @Date:2021/1/25
 * @Time:14:59
 * @Content:  用栈实现队列
 */
public class MyQueue {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();

    public MyQueue(){

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop(){
        if (empty()){
            return -1;
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if (empty()){
            return -1;
        }
        if(!stack2.isEmpty()){
            return stack2.peek();
        }else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty() ;
    }

}
