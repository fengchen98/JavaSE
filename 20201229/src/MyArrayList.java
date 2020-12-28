
import java.util.Arrays;

/**
 * @Author:FC
 * @Date:2020/12/28
 * @Time:20:15
 * @Content:
 */
public class MyArrayList {
    private int[] elem;
    private int usedValue;

    public MyArrayList() {
        this.elem = new int[5];
    }

    public MyArrayList(int capacity){
        this.elem=new int[capacity];
    }

    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

    public int getUsedValue() {
        return usedValue;
    }

    public void setUsedValue(int usedValue) {
        this.usedValue = usedValue;
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.usedValue ; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }

    public void resize(){
        this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
    }

    public boolean isFull(){
        if (this.usedValue==this.elem.length){
            return true;
        }
        return false;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (isFull()){
            resize();
        }
        if (pos<0||pos>this.usedValue){
            System.out.println("pos位置不合法！");
            return;
        }
        for (int i = this.usedValue-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedValue++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <elem.length ; i++) {
            if (elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

   // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <elem.length ; i++) {
            if (elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

   // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos<0||pos>=this.usedValue){
            System.out.println("pos位置不合法！");
            return -1;
        }

        return elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos<0||pos>=this.usedValue){
            System.out.println("pos位置不合法！");
            return ;
        }
        this.elem[pos]=value;

    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        //查找是否又关键字key
        int index=search(key);
        if (index==-1){
            System.out.println("关键字不存在");
            return;
        }
        for (int i = index; i <this.usedValue-1 ; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedValue--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedValue;
    }

    // 清空顺序表
    public void clear() {
        this.usedValue=0;
    }

}
