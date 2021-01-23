import java.util.Stack;

/**
 * @Author:FC
 * @Date:2021/1/22
 * @Time:11:20
 * @Content:
 */
public class TestDemo2 {
    public static void main(String[] args) {
        String s="abcdef";
        System.out.println(s.length());
        MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.display();
        myLinkedList.addFirst(99);
        myLinkedList.display();
    }


    public static void main3(String[] args) {
        MyArrayList<Integer> myArrayList=new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.display();
        myArrayList.remove();
        myArrayList.display();
    }


    public static void main2(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }


    public static void main1(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
