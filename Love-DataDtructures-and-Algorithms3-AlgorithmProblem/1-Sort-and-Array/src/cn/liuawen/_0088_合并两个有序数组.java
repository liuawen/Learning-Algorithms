package cn.liuawen;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-09
 */
public class _0088_合并两个有序数组 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = [1,3,5,0,0,0], m = 3
        // nums2 = [2,4,6],       n = 3
        int n1 = m - 1;
        int n2 = n - 1;
        int cur = nums1.length - 1;
        //归并排序
        //比大值 放到后面去
        while (n2 >= 0) {
            if (n1 >= 0 && nums2[n2] < nums1[n1]) {
                nums1[cur--] = nums1[n1--];
            } else { //n1<0 || nums2[n2]>nums1[n1]
                nums1[cur--] = nums2[n2--];
            }
        }
        //比小值 放到前面不行 可以覆盖或移动
    }

}
