/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-07
 */
public class Solution3 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        Solution3.removeZeros(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void removeZeros(int[] nums){
        if (nums == null) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //不等于0 左边 等于0 右边   想象一下就型   等于0与不等于换一个位置
            if (nums[i]!=0){
                int tmp = nums[i];
                nums[i]=nums[j];
                nums[j++]=tmp;
            }
        }
    }
}
