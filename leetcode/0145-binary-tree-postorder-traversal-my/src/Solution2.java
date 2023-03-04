import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-01
 */
public class Solution2 {
    private List<Integer> result = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return this.result;
        }

        TreeNode preRoot = null;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {   // 将 当前root 的 最左节点路径 录入，方便之后的操作
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();  // 将 当前未处理的 最左节点 取出
            if (root.right == null ||    // 该节点的右节点为null
                    root.right == preRoot) {    // 该节点的右节点 为 当前的根节点
                this.result.add(root.val);
                preRoot = root;
                root = null;
            } else {    // 将 该节点的 右子树 存入stack
                stack.push(root);
                root = root.right;
            }
        }

        return this.result;
    }
}
