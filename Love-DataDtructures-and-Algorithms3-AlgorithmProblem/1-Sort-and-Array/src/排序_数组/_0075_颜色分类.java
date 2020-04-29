package 排序_数组;

/**
 * https://leetcode-cn.com/problems/sort-colors/
 * 颜色分类
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-04-29 11:06
 */
public class _0075_颜色分类 {
    /*
     * 一个只包含0、1、2的整型数组，要求对它进行【原地】排序
     * 你能想出一个仅使用常数空间的一趟扫描算法吗？
     * 0、1、2整型数组 原地排序  常数空间 一趟扫描算法
     * 10大排序算法 借鉴下
     * 空间复杂度O(1)，时间复杂度O(n)
     */
    public void sortColors(int[] nums) {
        //0、1、2   左右
        int i = 0;
        int l = 0;
        int r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i++, l++);
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, r--);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
