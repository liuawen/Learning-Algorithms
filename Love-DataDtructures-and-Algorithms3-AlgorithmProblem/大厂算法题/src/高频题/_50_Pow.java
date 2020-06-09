package 高频题;

/**
 * https://leetcode-cn.com/problems/powx-n/
 */
public class _50_Pow {
    // T(n) = T(n/2) + O(1) = O(logn)
    public double myPow2(double x, int n) {
        if (n == 0) return 1;
        if (n == -1) return 1 / x;
        double half = myPow(x, n >> 1);
        half *= half;
        // 是否为奇数
        return ((n & 1) == 1) ? (half * x) : half;
    }

    public static double myPow(double x, int n) {
        long y = (n < 0) ? -((long) n) : n;
        double res = 1.0;
        while (y > 0) {
            if ((y & 1) == 1) {
                // 如果最后一个二进制位是1，就累乘上x
                res *= x;
            }
            x *= x;
            // 舍弃掉最后一个二进制位
            y >>= 1;
        }
        return (n < 0) ? (1 / res) : res;
    }

    public static int powMod1(int x, int y, int z) {
        if (y < 0 || z == 0) return 0;
        int res = 1 % z;
        x %= z;
        while (y > 0) {
            if ((y & 1) == 1) {
                // 如果最后一个二进制位是1，就累乘上x
                res = (res * x) % z;
            }
            x = (x * x) % z;
            // 舍弃掉最后一个二进制位
            y >>= 1;
        }
        return res;
    }

    // 2^100 % 6  = (2^50 * 2^50) % 6 = ((2^50 % 6) * (2^50 % 6)) % 6
    // 2^101 % 6 = (2^50 * 2^50 * 2) % 6 = ((2^50 % 6) * (2^50 % 6) * (2 % 6)) % 6
    public static int powMod(int x, int y, int z) {
        if (y < 0 || z == 0) return 0;
        if (y == 0) return 1 % z;
        int half = powMod(x, y >> 1, z);
        half *= half;
        if ((y & 1) == 0) { // 偶数
            return half % z;
        } else { // 奇数
            return (half * (x % z)) % z;
        }
    }

    public static void main(String[] args) {
        System.out.println(powMod1(-123, 455, 789));
        System.out.println(powMod(-123, 455, 789));
    }
}
