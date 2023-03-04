/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-06
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.validPalindrome("ababa"));
        System.out.println(solution1.validPalindrome("abcdeadcba"));
        System.out.println(solution1.validPalindrome("abcdeaadcba"));
        System.out.println(solution1.validPalindrome("abcdeaeaadcba"));
    }
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
