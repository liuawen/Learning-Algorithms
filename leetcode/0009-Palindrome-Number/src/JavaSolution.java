/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class JavaSolution {
    public boolean isPalindrome(int x) {
        if (x < 0) { // 负数肯定不是palindrome
            return false;
        }
        int temp = x;
        // 翻转之后的数字可能超过整型的范围
        long y = 0;
        while ( x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return  temp == y;
    }
}
