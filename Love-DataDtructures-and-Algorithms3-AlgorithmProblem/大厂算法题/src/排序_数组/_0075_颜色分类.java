package 排序_数组;


/**
 * https://leetcode-cn.com/problems/sort-colors/
 * 
 * @author MJ
 *
 */
public class _0075_颜色分类 {
	/*
	 * 一个只包含0、1、2的整型数组，要求对它进行【原地】排序
	 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
	 * 
	 * 空间复杂度O(1)，时间复杂度O(n)
	 */
    public void sortColors(int[] nums) {
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
