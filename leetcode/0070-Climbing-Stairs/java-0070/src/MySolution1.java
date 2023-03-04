/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-07
 */
public class MySolution1 {
    public static int climbStairs(int n) {
        if (n <= 1)
            return 1;
        if (n < 3)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
