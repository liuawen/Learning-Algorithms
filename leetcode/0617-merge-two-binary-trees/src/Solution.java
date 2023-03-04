/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-23
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 * 输入:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * 输出:
 * 合并后的树:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 * 注意: 合并必须从两个树的根节点开始。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路
 * 同步地遍历两棵树上的节点，直接在 t1 上修改。
 *
 * 如果把mergeTrees函数作为递归函数，它接收的t1和t2是指：当前遍历的节点（子树）
 *
 * 递归总是关注当前节点：
 *
 * t1、t2 都存在，将 t2 的节点值加到 t1 上来。
 * t1 为 null、t2 不是 null，t1 换成 t2。
 * t2 为 null、t1 不是 null，t1 依然 t1。
 * t1 和 t2 都为 null，t1 依然 t1。
 * 子树的合并，更新 t1 的子树，交给递归去做，它会对每一个节点做同样的事情。
 *
 * 作者：xiao_ben_zhu
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees/solution/shou-hua-tu-jie-by-xiao_ben_zhu-3/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * 时间复杂度我觉得是：O(N)O(N)，N 是 t1 和 t2 重合后的节点的个数（并集）。
 *
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}