import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-16
 */
public class Solution {
    //感觉这种多个不同选择的（但不是很多哈），
    //都可以暴搜 + 剪枝呢。比如这个题每步要么增加一个左括号，
    //要么增加一个右括号，是一个二叉的选择，所以暴搜很容易写出来，
    //就是dfs(left - 1, right, curStr + "("); dfs(left, right - 1, curStr + ")");
    //但是并不是每个分支都是符合要求的（正确的括号匹配），所以加上if来剪枝哈～
    //是先暴搜，再剪枝
        List<String> res = new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            dfs(n, n, "");
            return res;
        }
        private void dfs(int left, int right, String curStr) {
            if (left == 0 && right == 0) { // 左右括号都不剩余了，递归终止
                res.add(curStr);
                return;
            }

            if (left > 0) { // 如果左括号还剩余的话，可以拼接左括号
                dfs(left - 1, right, curStr + "(");
            }
            if (right > left) { // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
                dfs(left, right - 1, curStr + ")");
            }
        }
}
