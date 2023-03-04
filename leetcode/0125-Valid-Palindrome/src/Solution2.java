/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-17
 */
public class Solution2 {
    //我们还可以使用正则匹配，把特殊字符过滤掉，
    // 只留下字母和数字，然后转化为小写，再反转，最后在判断是否相等。
    // 当然这种写法只是提供了一种思路，面试中如果写出这种肯定还会让你再写一种的，因为它没有完全考察出对这题的解题思路，
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}
