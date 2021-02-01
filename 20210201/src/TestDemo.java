import java.util.Arrays;

/**
 * @Author:FC
 * @Date:2021/2/1
 * @Time:9:36
 * @Content:
 */
public class TestDemo {
    /**
     * 快速排序:
     * 时间复杂度：  最好：O(nlogn)   最坏：O(n²)
     * 空间复杂度：O(logn)
     * 稳定性：不稳定
     */
    public static int pivot(int[] array,int start,int end){
        int tmp=array[start];
        while (start<end){
            while (start<end && array[end]>=tmp){
                end--;
            }
                array[start]=array[end];

            while (start<end && array[start]<=tmp){
                start++;
            }
                array[end]=array[start];
        }
        array[start]=tmp;
        return start;
    }
    public static void quick(int[] array,int low,int high){
        if (low<high){
            int pivot=pivot(array,low,high);
            quick(array,low,pivot-1);
            quick(array,pivot+1,high);
        }
    }
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }



    /**
     * 冒泡排序:
     * 时间复杂度：O(n²)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }





/**
 * 堆排序:
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
//public void adjustDown(int parent,int len){
//    int child = parent*2+1;
//    //说明有左孩子
//    while (child<len){
//        if(child+1<len && this.elem[child]<this.elem[child+1]){
//            child++;
//        }
//        if(this.elem[child]>this.elem[parent]){
//            int temp = this.elem[child];
//            this.elem[child]=this.elem[parent];
//            this.elem[parent]=temp;
//            parent=child;
//            child=2*parent+1;
//        } else {
//            break;
//        }
//    }
//}
//public static void heapSort(){
//    int end=this.usedSize-1;
//    while (end>0){
//        int tmp=this.elem[0];
//        this.elem[0]=this.elem[end];
//        this.elem[end]=tmp;
//        adjustDown(0,end);
//        end--;
//    }
//}


    //选择排序
    /**
     * 时间复杂度：O(n²)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i <array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }





    //希尔排序
    /**
     * 时间复杂度：O(n²)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void shell(int[] array,int gap){
        for (int i = gap; i <array.length ; i++) {
            int tmp=array[i];
            int j=i-gap;
            for ( ;j>=0;j-=gap){
                if (array[j]>tmp){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }
    public static void shellSort(int[] array) {
        int[] drr={5,3,1};  //增量数组
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }






    /**
     * 时间复杂度：
     * 最坏情况：O(n²)
     * 最好情况：O(n)
     * 结论：越有序越快
     * 空间复杂度：
     * 稳定性：稳定
     * @param arr
     */
    //直接插入排序
    public static  void  insertSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int tmp=arr[i];
            int j=i-1;
            for ( ;j>=0;j--){
                if (arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {10,3,2,7,19,78,65,127};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
       

//        quickSort(array);
//        System.out.println(Arrays.toString(array));

        // selectSort(array);
        //System.out.println(Arrays.toString(array));
        //insertSort(array);
     // System.out.println(Arrays.toString(array));
       // shellSort(array);
       // System.out.println(Arrays.toString(array));
    }
}