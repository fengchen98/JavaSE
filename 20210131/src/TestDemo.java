import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author:FC
 * @Date:2021/1/31
 * @Time:9:00
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        Heap heap=new Heap();
        int[] array={27,15,19,18,28,34,65,49,25,37};
        heap.createBigHeap(array);
        heap.heapSort();
        heap.show();
    }



    /**
     * 找前K个最大的元素
     * @param array
     */
    public static void  topK(int[] array,int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for (int i = 0; i <array.length ; i++) {
            if (minHeap.size()<k){
                minHeap.offer(array[i]);
            }else {
                int top=minHeap.peek();
                if (array[i]>top){
                    minHeap.poll();
                    minHeap.offer(array[i]);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(minHeap.poll());
        }
    }



    public static void main2(String[] args) {
        int[] array={27,15,19,18,28,34,65,49,25,37};
        topK(array,3);
    }

    public static void main1(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
        queue.offer(3);
        queue.offer(1);
        queue.offer(4);
        queue.offer(2);
        queue.offer(5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }
}
