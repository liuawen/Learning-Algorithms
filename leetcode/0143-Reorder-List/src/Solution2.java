/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-21
 */
public class Solution2 {
    //递归
    //解法一中也说到了，我们的问题就是取尾元素的时候，需要遍历一遍链表。
    //
    //如果我们的递归函数能够返回当前头元素对应的尾元素，并且将头元素和尾元素之间的链表按要求完成，那就变得简单了
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        int len = 0;
        ListNode h = head;
        //求出节点数
        while (h != null) {
            len++;
            h = h.next;
        }
        reorderListHelper(head, len);
    }

    private ListNode reorderListHelper(ListNode head, int len) {
        if (len == 1) {
            ListNode outTail = head.next;
            head.next = null;
            return outTail;
        }
        if (len == 2) {
            ListNode outTail = head.next.next;
            head.next.next = null;
            return outTail;
        }
        //得到对应的尾节点，并且将头结点和尾节点之间的链表通过递归处理
        ListNode tail = reorderListHelper(head.next, len - 2);
        ListNode subHead = head.next;//中间链表的头结点
        head.next = tail;
        ListNode outTail = tail.next;  //上一层 head 对应的 tail
        tail.next = subHead;
        return outTail;
    }

}
