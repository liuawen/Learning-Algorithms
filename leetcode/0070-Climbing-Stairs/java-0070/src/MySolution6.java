/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-07
 */
public class MySolution6 {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1, secend = 2, sum = 0;
        while (n-- > 2) {
            sum = first + secend;
            first = secend;
            secend = sum;
        }
        return sum;
    }
}
