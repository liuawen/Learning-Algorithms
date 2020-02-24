package algo;

import java.util.*;

public class InsertionSort{

    // 我们的算法类不允许产生任何实例
    private InsertionSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // 寻找元素arr[i]合适的插入位置

            // 写法1
            // 比较  当前与它的前一个  小于的话就交换  大的话就中止这一趟
            // 插入排序比选择  第二个循环比较提前中止   理论上插入比选择快点 但是...实际上为什么更慢呢？下一节
            // 插入可以去改进吧
//            for( int j = i ; j > 0 ; j -- )
//                if( arr[j].compareTo( arr[j-1] ) < 0 )
//                    swap( arr, j , j-1 );
//                else
//                    break;

            // 写法2
            //同时满足两个 j > 0   小于的话就一直交换  一旦大于就中止 下一个数进行比较
            for( int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0 ; j--)
                swap(arr, j, j-1);

        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // 测试InsertionSort
    public static void main(String[] args) {

        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("algo.InsertionSort", arr);
        SortTestHelper.printArray(arr);
        return;
    }
}