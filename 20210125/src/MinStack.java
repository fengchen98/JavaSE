import java.util.Stack;

/**
 * @Author:FC
 * @Date:2021/1/25
 * @Time:15:10
 * @Content:  最小栈
 */
public class MinStack {
    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();

    public MinStack(){

    }

    public void push(int x){
        stack.push(x);
        if (minStack.isEmpty()){
            minStack.push(x);
        }else {
            if (x<=minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop(){
        int x=stack.pop();
        if (x==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
