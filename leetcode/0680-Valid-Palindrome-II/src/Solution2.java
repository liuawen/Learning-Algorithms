/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-06
 */
public class Solution2 {
    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, 1);
    }

    /**
     * @param s      输入字符串
     * @param left   左指针
     * @param right  右指针
     * @param chance 删除节点的机会次数
     */
    private boolean validPalindrome(String s, int left, int right, int chance) {
        if (left > right) {
            return true;
        }
        if (s.charAt(left) == s.charAt(right)) {
            return validPalindrome(s, left + 1, right - 1, chance);
        } else {
            if (chance == 0) {
                return false;
            }
            return validPalindrome(s, left, right - 1, chance - 1) || validPalindrome(s, left + 1, right, chance - 1);
        }
    }

}
