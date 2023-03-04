import java.util.HashSet;
import java.util.Set;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-31
 */
public class Solution2 {
    //题中提示中数组的大小和长度都有了限制，所以我们还可以使用数组

    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            count[1000 + arr[i]]++;
        }
        Set<Integer> set = new HashSet<>();
        for (int value : count) {
            if (value == 0)
                continue;
            if (!set.add(value))//如果存储失败，说明有重复的
                return false;
        }
        return true;
    }

}
