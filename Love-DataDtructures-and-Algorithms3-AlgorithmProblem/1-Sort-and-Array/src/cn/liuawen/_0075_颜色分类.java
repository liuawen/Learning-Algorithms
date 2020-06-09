package cn.liuawen;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/sort-colors/
 * 颜色分类
 *
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-09
 */
public class _0075_颜色分类 {
    /*
     * 一个只包含0、1、2的整型数组，要求对它进行【原地】排序
     * 你能想出一个仅使用常数空间的一趟扫描算法吗？
     * 0、1、2整型数组 原地排序  常数空间 一趟扫描算法
     * 10大排序算法 借鉴下 思想
     * 空间复杂度O(1)，时间复杂度O(n)
     * 有要求的  原地排序  O(1) 一趟扫描O(n)
     *
     */

    //有可能借助双指针 三指针 要求你扫描一遍就解决
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);//没那么简单 空间时间不满足

//        for (int i = 0; i < nums.length; i++) {
//
//        }
        int i = 0;
        int l = 0;
        int r = nums.length - 1;
        /**
         * 遇到1 跳过  i++
         * 遇到0 i与l交换 l为0了 l++ i也++ 下一个判断
         * 遇到2 i与r交换 r为2了 r可以-- 但i的值变化了 再次继续判断
        */
        while (i <= r) {
            int v = nums[i];
            if (v == 0) {
/*                swap(nums, i, l);
                i++;
                l++;*/
                swap(nums,i++, l++);
                //交换完 直接i++ l++  i
            } else if (v == 1) {
                i++;
            } else {    //v==2
/*                //error
                swap(nums, i, r);
                i++;
                r--;*/
                swap(nums, i, r--);
                //交互 r-- i的值变化了 需要再对i进行判断值
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
