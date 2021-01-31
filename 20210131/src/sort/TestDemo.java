package sort;

import java.util.*;

/**
 * @Author:FC
 * @Date:2021/1/31
 * @Time:11:48
 * @Content:
 */
public class TestDemo {
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
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
