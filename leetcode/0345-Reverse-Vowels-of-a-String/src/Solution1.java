import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
        import java.util.HashSet;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-06
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
 * <p>
 * 示例 1：
 * <p>
 * 输入："hello"
 * 输出："holle"
 * 示例 2：
 * <p>
 * 输入："leetcode"
 * 输出："leotcede"
 *  
 * <p>
 * 提示：
 * <p>
 * 元音字母不包含字母 "y" 。
 */
//字符数组
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.reverseVowels("LeetCode"));
    }
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        if (s == null) return null;
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {
                result[i++] = ci;
            } else if (!vowels.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }
}
