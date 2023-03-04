import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-22
 */
class Solution {
    //字符串 S 由小写字母组成。
    //我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
    //
    //
    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> result = new ArrayList<>();
        if (S == null || S.length() <= 0) {
            return result;
        }

        /*
            填充 lastIndex数组
         */
        int[] lastIndex = new int[26]; // 存储 一个字母 的 最后一次出现下标
        Arrays.fill(lastIndex, -1);
        int length = S.length();
        for (int i = 0; i < length; i++) {
            lastIndex[S.charAt(i) - 'a'] = i;
        }

        /*
            计算 结果数组
         */
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < length; i++) {
            endIndex = Math.max(endIndex, lastIndex[S.charAt(i) - 'a']);    // 取出当前最大的 最后一个下标
            if (i == endIndex) {    // 若 相等，则之前的所有元素，都仅在 i之前出现，可以记录结果
                result.add(endIndex - startIndex + 1);
                startIndex = endIndex + 1;
            }
        }

        return result;
    }
}

