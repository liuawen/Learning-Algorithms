package cn.liuawen;

/**
 * https://leetcode-cn.com/problems/sub-sort-lcci/
 * 面试题_16_16_部分排序
 *
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-09
 * 给定一个整数数组，编写一个函数，找出索引m和n，只要将索引区间[m,n]的元素排好序，整个数组就是有序的。注意：n-m尽量最小，也就是说，找出符合条件的最短序列。函数返回值为[m,n]，若不存在这样的m和n（例如整个数组是有序的），请返回[-1,-1]。
 * 示例：
 * 输入： [1,2,4,7,10,11,7,12,6,7,16,18,19]
 * 输出： [3,9]
 * 提示：
 * 0 <= len(array) <= 1000000
 * 通过次数3,020提交次数7,038
 */
public class 面试题_16_16_部分排序 {
    /*
     * { 1, 5, 4, 3, 2, 6, 7 }
     * 5 4 3 2 进行排好序就行了   [1,4]   保证n-m尽量最小 找到最短序列的
     *  5 4 3 2 6
     * 部分排好序 就完成了排序
     * 找出索引m和n就可以了 没有返回[-1,-1]
     * 寻找的是? 没有排序的部分
     * 寻找逆序对  大 小
     * 找到最后逆序对
     *
     * 寻找的是？没有排好序的部分
     * 寻找逆序对   5 2  5 4 5 3 逆序对 5开始有逆序对 最远的
     * 1 5 4  3  2    6  7  2  8
     * 找到最后一个逆序对
     * 最右边确认
     * 最后一个
     * 最右边位置的确定
     * 最右边位置 最右逆序对的位置
     * 从左往右 越来越大  找到最后一个逆序对
     * 变小 逆序对
     * 从右往左 变小  找到最后一个逆向的地方
     *
     *
     */
    public int[] subSort(int[] nums) {
        //从左扫描到右  寻找逆序对 （正序是越来越大）
        //一上来1
//        int max=nums[0];

        if (nums.length == 0) return new int[] { -1, -1 };

        // 从左扫描到右寻找逆序对（正序：逐渐变大）
        int max = nums[0];
        // 用来记录最右的那个逆序对位置
        int r = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            } else {
                r = i;
            }
        }

        // 提前结束
        if (r == -1) return new int[] { -1, -1 };

        // 从右扫描到左寻找逆序对（正序：逐渐变小）
        int min = nums[nums.length - 1];
        // 用来记录最左的那个逆序对位置
        int l = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= min) {
                min = nums[i];
            } else { //逆序对 大的
                l = i;
            }
        }

        return new int[] { l, r };

    }
}
