import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-31
 */
public class Solution1 {
    //先计算每个数出现的次数，再逐步存放到集合中，判断是否存放成功
    //在set集合中如果有相同的元素，就会存储失败，返回false，每次存储的时候我们只要判断是否存储成功即可，代码如下
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int value : map.values()) {
            if (!set.add(value))//如果存储失败，说明有重复的
                return false;
        }
        return true;
    }

}
