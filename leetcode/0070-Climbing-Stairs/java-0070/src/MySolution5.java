/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-07
 */
public class MySolution5 {
    public static void main(String[] args) {
//        System.out.println(MySolution5.climbStairs(100));//100就爆炸了
        System.out.println(MySolution5.climbStairs(100));//100就爆炸了

    }
    public static int climbStairs(int n) {
        return Fibonacci(n, 1, 1);
    }

    public static int Fibonacci(int n, int a, int b) {
        if (n <= 1)
            return b;
        return Fibonacci(n - 1, b, a + b);
    }
}
