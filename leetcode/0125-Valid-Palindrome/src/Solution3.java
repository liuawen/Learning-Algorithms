/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-17
 */
public class Solution3 {
    //如果想玩出花样，我们还可以把第一种的解题思路改为递归的方式
    public boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    public boolean isPalindromeHelper(String s, int left, int right) {
        if (left >= right)
            return true;
        while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
            left++;
        while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
            right--;
        return Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right)) && isPalindromeHelper(s, ++left, --right);
    }

}
