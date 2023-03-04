/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-07
 */
public class MySolution2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(MySolution2.rob(nums));
    }
    public static int rob(int[] nums) {
        int prev = 0;
        int curr = 0;

        // 每次循环，计算“偷到当前房子为止的最大金额”
        for (int i : nums) {
            // 循环开始时，curr 表示 dp[k-1]，prev 表示 dp[k-2]
            // dp[k] = max{ dp[k-1], dp[k-2] + i }
            int temp = Math.max(curr, prev + i);
            prev = curr;
            curr = temp;
            // 循环结束时，curr 表示 dp[k]，prev 表示 dp[k-1]
        }

        return curr;
    }
}
