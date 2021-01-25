import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author:FC
 * @Date:2021/1/24
 * @Time:9:11
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue=new MyCircularQueue(8);
        System.out.println(myCircularQueue.isEmpty());
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
        myCircularQueue.enQueue(5);
        myCircularQueue.enQueue(6);
        myCircularQueue.enQueue(7);
        System.out.println(myCircularQueue.isFull());
        myCircularQueue.deQueue();
        System.out.println(myCircularQueue.Front());


    }


    public static void main2(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.peek());

    }


    public static void main1(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.poll()); //和remove()一样
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.addFirst("h");
    }
}
