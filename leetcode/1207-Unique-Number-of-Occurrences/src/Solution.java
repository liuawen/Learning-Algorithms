import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-29
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 *
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 *
 * 输入：arr = [1,2]
 * 输出：false
 *
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * 输出：true
 * 提示：
 *
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 */
public class Solution {
   //1，先计算每个数出现的次数，再存放到集合set中，判断长度
   //第一步都是要先计算每个数出现的次数。后面的只需要判断这个出现次数的数组中元素是否有重复的即可。
    //
    //我们知道集合set是不能有重复元素的，如果有就会替换掉，我们可以把出现次数的数组放到集合set中，
    //如果有重复的就会被替换掉，那么set的大小肯定和出现次数的数组长度不一样。否则如果没有重复的，他们的长度肯定是一样的，看下代码
   public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
       }
       return map.size() == new HashSet<>(map.values()).size();
   }


}
