/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-17
 *  * 回文的常见的3种做法：双指针，栈，reverse
 *  *  1.库里面的api工作上随便用，如果来练习算法的话还是尽量少用库里面的api比较好。、
 *  *  比如sb.reverse()；实际人家抖以及帮你写好了翻转实现。
 *  *  2.代码行数和性能什么无关，你这里面用(sb.reverse() 本身就是一个耗时计算。。
 */
public class Solution4 {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLetterOrDigit(c))    sb.append(c);
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
