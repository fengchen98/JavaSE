/**
 * @Author:FC
 * @Date:2021/1/29
 * @Time:11:11
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        Heap heap=new Heap();
        int[] arr={ 27,15,19,18,28,34,65,49,25,37};
        heap.createBigHeap(arr);
        heap.show();
        heap.push(100);
        heap.show();
        System.out.println(heap.poll());
        heap.show();
        System.out.println(heap.peek());
    }
}
