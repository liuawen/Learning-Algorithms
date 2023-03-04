/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-17
 */
public class Solution1 {
    //我们还可以在比较之前字母全部转化为小写，这里改为for循环的方式，
    //只不过是换汤不换药，原理还都是一样的
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
