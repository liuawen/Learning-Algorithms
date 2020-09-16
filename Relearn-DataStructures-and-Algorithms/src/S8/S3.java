package S8;

import java.awt.image.AbstractMultiResolutionImage;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-19
 */
public class S3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}