package 高频题;

/**
 * https://leetcode-cn.com/problems/reverse-integer/
 */
public class _7_整数反转 {

    public int reverse1(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            if (res > Integer.MAX_VALUE) return 0;
            if (res < Integer.MIN_VALUE) return 0;
            x /= 10;
        }
        return (int) res;
    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int prevRes = res;
            int mod = x % 10;
            res = prevRes * 10 + mod;
            if ((res - mod) / 10 != prevRes) return 0;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(new _7_整数反转().reverse(Integer.MAX_VALUE));
    }

}
