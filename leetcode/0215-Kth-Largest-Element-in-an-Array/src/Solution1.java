import java.util.Arrays;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-09
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,4,2,1,5};
        int n = Solution1.findKthLargest(nums,1);
        System.out.println(n);
        System.out.println("-----------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
