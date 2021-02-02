import java.util.Arrays;
import java.util.Stack;

/**
 * @Author:FC
 * @Date:2021/2/2
 * @Time:9:21
 * @Content:
 */
public class TestDemo {
    /**
     * 归并排序  非递归实现
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     *  稳定性：稳定
     */
    public static void merge(int[] array,int gap) {

        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 < array.length ? s2+gap-1 : array.length-1;

        int[] tmp = new int[array.length];
        int k = 0;//下标

        //当有两个归并段的时候
        while (s2 < array.length) {
            //当当有两个归并段 且 这两个段内都要数据
            while (s1 <= e1 && s2<= e2) {
                if(array[s1] <= array[s2]) {
                    tmp[k++] = array[s1++];
                }else{
                    tmp[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                tmp[k++] = array[s1++];
            }
            while (s2 <= e2){
                tmp[k++] = array[s2++];
            }
            //从这里开始的时候，每个下标都可能越界
            s1 = e2+1;//
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2+gap-1 < array.length ? s2+gap-1 : array.length-1;
        }

        //退出上面循环后，
        // 那么把s1段内的数据给拷贝下来,因为 有可能e1已经越界了
        while (s1 < array.length) {
            tmp[k++] = array[s1++];
        }

        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }

    }
    public static void mergeSort2(int[] array){
        for (int i = 1; i < array.length; i*=2) {
            merge(array,i);
        }
    }


    /**
     * 归并排序
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     *  稳定性：稳定
     * @param array
     * @param start
     * @param mid
     * @param end
     */
    public static void merge(int[] array,int start,int mid,int end){
        int s1=start;
        int s2=mid+1;
        int[] tmp=new int[end-start+1];
        int k=0;
        while (s1<=mid && s2<=end){
            if (array[s1]<=array[s2]){
                tmp[k]=array[s1];
                k++;
                s1++;
            }
            if (array[s2]<=array[s1]){
                tmp[k]=array[s2];
                k++;
                s2++;
            }
        }
        while (s1<=mid){
            tmp[k]=array[s1];
            k++;
            s1++;
        }
        while (s2<=end){
            tmp[k]=array[s2];
            k++;
            s2++;
        }
        for (int i = 0; i <tmp.length; i++) {
            array[i+start]=tmp[i];
        }
    }
    public static void mergeSortInternal(int[] array,int low,int high){
        if (low>=high)  return;
        int mid=(low+high)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);
    }
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }



    /**
     * 快速排序的非递归实现
     * 时间复杂度：  O(nlogn)
     * 空间复杂度：O(logn)
     * 稳定性：不稳定
     * @param array
     */
    public static void quickSort1(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int low = 0;
        int high = array.length-1;
        int piv = pivot(array,low,high);//
        if(piv > low + 1) {
            stack.push(low);
            stack.push(piv-1);
        }
        if(piv < high-1) {
            stack.push(piv+1);
            stack.push(high);
        }
        while (!stack.empty()) {
            high=stack.pop();
            low=stack.pop();
            piv=pivot(array,low,high);
            if(piv > low + 1) {
                stack.push(low);
                stack.push(piv-1);
            }
            if(piv < high-1) {
                stack.push(piv+1);
                stack.push(high);
            }
        }
    }




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
        mergeSort2(array);
        System.out.println(Arrays.toString(array));
//        mergeSort(array);
//        System.out.println(Arrays.toString(array));

        //quickSort1(array);
        //System.out.println(Arrays.toString(array));

        //bubbleSort(array);
       // System.out.println(Arrays.toString(array));


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
