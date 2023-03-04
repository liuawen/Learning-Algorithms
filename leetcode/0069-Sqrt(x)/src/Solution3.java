import java.util.HashMap;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-08
 */
public class Solution3 {
    public int mySqrt(int x) {
        long left = 0;
        long right = x / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sqr = mid * mid; // 该值为 mid ^ 2，如果 mid 使用 int，在 x=2147395599 时, 则 mid * mid 会先越界，再被转型成 long
            long nextSqr = (mid + 1) * (mid + 1); // 该值为（mid + 1）^ 2，

            if (sqr == x || (sqr < x && nextSqr > x)) {
                return (int) mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else if (sqr > x) {
                right = mid - 1;
            }
        }
        //请问一下这最后的return x；是为了防止什么样的情况的呢？
        //防止编译器不给通过
        //其实你想知道这个是干嘛的话，可以把它改成一个随意的值，
        //比如 -1，然后就会报错，你就知道他是判断什么情况的了。在这里其实是用来处理 1 * 1 是 1 的情况的。
        return x;

    }
}