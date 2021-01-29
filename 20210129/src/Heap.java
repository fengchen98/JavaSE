import java.util.Arrays;

/**
 * @Author:FC
 * @Date:2021/1/29
 * @Time:11:09
 * @Content:
 */
public class Heap {
    public  int[] elem;
    public int usedSize;


    public Heap() {
        this.elem = new int[10];
    }

    public void adjustDown(int parent,int len){
        int child = parent*2+1;
        //说明有左孩子
        while (child<len){
            if(child+1<len && this.elem[child]<this.elem[child+1]){
                child++;
            }
            if(this.elem[child]>this.elem[parent]){
                int temp = this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=temp;
                parent=child;
                child=2*parent+1;
            } else {
                break;
            }
        }
    }

    public void createBigHeap(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            this.elem[i] = arr[i];
            this.usedSize++;
        }

        for (int i = (this.usedSize-1-1)/2; i >=0 ; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    public void show(){
        for (int i = 0; i <usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return this.usedSize==this.elem.length;
    }

    public void adjustUp(int child){
        int parent=(child-1)/2;
        while (child>0){
            if (this.elem[child]>this.elem[parent]){
                int temp = this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=temp;
                child=parent;
                parent=(child-1)/2;
            }else {
                break;
            }
        }
    }

    public void push(int val){
        if (isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[usedSize]=val;
        usedSize++;
        adjustUp(this.usedSize-1);
    }

    public boolean isEmpty(){
        return this.usedSize==0;
    }

    public int poll(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int ret=this.elem[0];
        int tmp=this.elem[0];
        this.elem[0]=this.elem[usedSize-1];
        this.elem[this.usedSize-1]=tmp;
        usedSize--;
        adjustDown(0,this.usedSize);
        return ret;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return this.elem[0];
    }
}
