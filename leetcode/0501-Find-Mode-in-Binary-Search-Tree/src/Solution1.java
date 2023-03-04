import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-24
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 *
 * 假定 BST 有如下定义：
 *
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 * 返回[2].·
 *
 * 提示：如果众数超过1个，不需考虑输出顺序
 *
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-mode-in-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution1 {

    List<Integer> mList = new ArrayList<>();
    int curent = 0;//表示当前节点的值
    int count = 0;//表示当前节点的数量
    int maxCount = 0;//最大的重复数量

    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] res = new int[mList.size()];
        //把集合list转化为数组
        for (int i = 0; i < mList.size(); i++) {
            res[i] = mList.get(i);
        }
        return res;
    }

    //递归方式
    public void inOrderTraversal(TreeNode node) {
        //终止条件判断
        if (node == null)
            return;
        //遍历左子树
        inOrderTraversal(node.left);

        //下面是对当前节点的一些逻辑操作
        int nodeValue = node.val;
        if (nodeValue == curent) {
            //如果节点值等于curent，count就加1
            count++;
        } else {
            //否则，就表示遇到了一个新的值，curent和count都要
            //重新赋值
            curent = nodeValue;
            count = 1;
        }
        if (count == maxCount) {
            //如果count == maxCount，就把当前节点加入到集合中
            mList.add(nodeValue);
        } else if (count > maxCount) {
            //否则，当前节点的值重复量是最多的，直接把list清空，然后
            //把当前节点的值加入到集合中
            mList.clear();
            mList.add(nodeValue);
            maxCount = count;
        }

        //遍历右子树
        inOrderTraversal(node.right);
    }

}
