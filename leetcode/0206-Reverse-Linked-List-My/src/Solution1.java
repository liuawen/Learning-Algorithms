/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-20
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *我们可以申请两个指针，第一个指针叫 pre，最初是指向 null 的。
 * 第二个指针 cur 指向 head，然后不断遍历 cur。
 * 每次迭代到 cur，都将 cur 的 next 指向 pre，然后 pre 和 cur 前进一位。
 * 都迭代完了(cur 变成 null 了)，pre 就是最后一个节点了。
 */
class Solution1 {
    public ListNode reverseList(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}