package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations/
 */
public class _46_全排列2 {
    private List<List<Integer>> list;
    private int[] nums;
    /** 用来保存每一层选择的数字 */
    private List<Integer> result;

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) return null;
        list = new ArrayList<>();
        if (nums.length == 0) return list;
        this.nums = nums;
        result = new ArrayList<>();
        dfs(0);
        return list;
    }

    private void dfs(int idx) {
        // 不能再往下搜索
        if (idx == nums.length) {
            list.add(new ArrayList<>(result));
            return;
        }

        // 枚举这一层所有可以做出的选择
        for (int num : nums) {
            if (result.contains(num)) continue;

            result.add(num);

            dfs(idx + 1);

            result.remove(result.size() - 1);
        }
    }
}
