/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-07
 */
public class MySolution4 {
    public int climbStairs(int n) {
        int pre = 1, preOfPre = 1, cur = 1;
        for(int i = 2; i <= n; i++) {
            cur = pre + preOfPre;
            preOfPre = pre;
            pre = cur;
        }
        return cur;
    }
}
