/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-07-02
 */
public class _0344_reverse_string {
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }
        // 左右双指针
        int left = 0;
        int right = s.length - 1;
        // 交换元素的临时变量 temp
        char temp;

        while (left < right){
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
        return;
    }
}
