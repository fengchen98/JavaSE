
import java.util.Arrays;

/**
 * @Author:FC
 * @Date:2021/1/22
 * @Time:16:10
 * @Content:
 */
public class MyArrayList<T> {
    private int usedSize;
    private T[] elem;

    public MyArrayList(){
        this.elem=(T[])new Object[10];
        usedSize=0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elem=" + Arrays.toString(elem) +
                '}';
    }

    //展示
    public void display(){
        for (int i = 0; i <usedSize ; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }

    //尾插
    public void add(T val){
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }

    //尾删
    public void remove(){
        this.elem[usedSize - 1] = null;
        usedSize--;
    }
}
