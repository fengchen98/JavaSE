/**
 * @Author:FC
 * @Date:2021/1/24
 * @Time:10:58
 * @Content:
 */
public class MyCircularQueue {

    private int front;
    private int rear;//代表当前可以存放数据元素的下标
    private int[] elem;

    public MyCircularQueue(int k) {
        this.elem = new int[k+1];
        this.front = 0;
        this.rear = 0;
    }

    /**
     * 入队
     * (rear+1)  % len
     * @param value
     * @return
     */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        //放到数组的rear下标  rear往后走
        this.elem[rear]=value;
        rear=(rear+1)%elem.length;
        return true;
    }

    /**
     * 队列是否为满
     * @return
     */
    public boolean isFull() {
        if ((rear+1)%elem.length==front){
            return true;
        }
        return false;
    }

    /**
     * 出队
     * @return
     */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        //只需要挪动front这个下标就好了
        front=(front+1)%this.elem.length;
        return true;
    }

    /**
     * 队列是否为空
     * @return
     */
    public boolean isEmpty() {
        if (front==rear){
            return true;
        }
        return false;
    }

    /**
     * 得到队头元素
     * @return
     */
    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return this.elem[front];
    }

    /**
     * 得到队尾元素
     * @return
     */
    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        int index=-1;
        if (this.rear==0){
            index=this.elem.length-1;
        }else{
            index=this.rear-1;
        }
        return this.elem[index];
    }




}
