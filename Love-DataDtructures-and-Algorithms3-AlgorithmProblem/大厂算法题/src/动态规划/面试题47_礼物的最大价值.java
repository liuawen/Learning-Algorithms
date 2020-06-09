package 动态规划;

/**
 * https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 * 
 * @author MJ
 *
 */
public class 面试题47_礼物的最大价值 {
    public int maxValue(int[][] grid) {
    	int rows = grid.length;
    	int cols = grid[0].length;
    	
    	int[][] dp = new int[rows][cols];
    	dp[0][0] = grid[0][0];
    	// 第0行
    	for (int col = 1; col < cols; col++) {
			dp[0][col] = dp[0][col - 1] + grid[0][col];
		}
    	// 第0列
    	for (int row = 1; row < rows; row++) {
			dp[row][0] = dp[row - 1][0] + grid[row][0];
		}
    	for (int row = 1; row < rows; row++) {
			for (int col = 1; col < cols; col++) {
				dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]) + grid[row][col];
			}
		}
    	return dp[rows - 1][cols - 1];
    }
}
