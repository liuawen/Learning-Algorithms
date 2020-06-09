package 高频题;

/**
 * https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 */
public class 面试题_62_圆圈中最后剩下的数字 {
    // f(n, m) = (f(n – 1, m) + m) % n
    public int lastRemaining1(int n, int m) {
        return (n == 1) ? 0 : (lastRemaining1(n - 1, m) + m) % n;
    }

    // f(1, 3) = 0
    // f(2, 3) = (f(1, 3) + 3) % 2
    // ...
    // f(7, 3) = (f(6, 3) + 3) % 7
    // f(8, 3) = (f(7, 3) + 3) % 8
    // f(9, 3) = (f(8, 3) + 3) % 9
    // f(10, 3) = (f(9, 3) + 3) % 10
    public int lastRemaining(int n, int m) {
        int res = 0;
        for (int i = 2; i <= n; i++) { // i是数据规模，代表有多少个数字（有多少个人）
            res = (res + m) % i;
        }
        return res;
    }

    public static void main(String[] args) {
        面试题_62_圆圈中最后剩下的数字 o = new 面试题_62_圆圈中最后剩下的数字();
        System.out.println(o.lastRemaining(10, 17));
    }
}
