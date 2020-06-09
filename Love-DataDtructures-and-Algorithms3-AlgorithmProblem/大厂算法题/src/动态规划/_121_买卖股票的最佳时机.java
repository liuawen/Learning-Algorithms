package 动态规划;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * @author MJ
 *
 */
public class _121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
    	if (prices == null || prices.length == 0) return 0;
    	// 前面扫描过的最小价格
    	int minPrice = prices[0];
    	// 前面扫描过的最大利润
    	int maxProfit = 0;
    	// 扫描所有的价格
    	for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else { // 把第i天的股票卖出
				maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			}
		}
    	return maxProfit;
    }
}


