package cn.liuawen;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-09
 *  Arrays.sort(nums);
 * 突如其来的想法，灵感来源于在搬砖中使用了过多的ifelse
 * hah，大佬轻喷，娱乐一下
 * 和我的差不多
 * 原地排序，大哥 好吧 我错了
 * 空间复杂度O(1)，时间复杂度O(n)
 *   题目要求只遍历一次，　这个２次了。
 *  public void sortColors(int[] nums) {
 *         int[] num = new int[3];
 *         for(int i=0;i<nums.length;i++){
 *             if(nums[i] == 0){
 *                 num[0]++;
 *             }else if (nums[i] == 1){
 *                 num[1]++;
 *             }else {
 *                 num[2]++;
 *             }
 *         }
 *         for(int i=0;i<nums.length;i++){
 *             if(i < num[0]){
 *                 nums[i] = 0;
 *             }else if(i>=num[0] && i<num[0]+num[1]){
 *                 nums[i] = 1;
 *             }else{
 *                 nums[i] = 2;
 *             }
 *         }
 *     }
 *
 */
public class _0075__SortColors {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                l++;
            } else if (nums[i] == 2) {
                r++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < l) {
                nums[i] = 0;
            } else if (i >= (nums.length - r)) {
                nums[i] = 2;
            } else {
                nums[i] = 1;
            }
        }
    }
}
