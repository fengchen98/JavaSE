/**
 * @Author:FC
 * @Date:2021/1/25
 * @Time:8:58
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(1);
        minStack.push(-1);
        minStack.push(5);
        minStack.push(-2);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }


    public static void main2(String[] args) {
        MyQueue myQueue=new MyQueue();
        System.out.println(myQueue.empty());
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.peek());
        myQueue.pop();
        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());


    }


    public static void main1(String[] args) {
        MyStack myStack=new MyStack();
        System.out.println(myStack.empty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}
