package algo;

import java.util.Arrays;

public class Main {

    // 比较SelectionSort和InsertionSort两种排序算法的性能效率
    // 此时，插入排序比选择排序性能略低
    public static void main(String[] args) {

        int N = 200000;//20万个数排序
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");

        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);//拷贝数组

        SortTestHelper.testSort("algo.SelectionSort", arr1);
        SortTestHelper.testSort("algo.InsertionSort", arr2);

        return;
    }
}
