package 链表;

/**
 * https://leetcode-cn.com/problems/partition-list/
 * 
 * @author MJ
 *
 */
public class _0086_分隔链表 {
	public ListNode partition(ListNode head, int x) {
		if (head == null) return null;
		ListNode lHead = new ListNode(0);
		ListNode lTail = lHead;
		ListNode rHead = new ListNode(0);
		ListNode rTail = rHead;
		while (head != null) {
			if (head.val < x) { // 放在lTail后面
				lTail.next = head;
				lTail = head;
			} else { // 放在rTail后面
				rTail.next = head;
				rTail = head;
			}
			head = head.next;
		}
		// 这句代码不能少
        /* 
         * 因为可能出现这样的情况:
         * 原链表倒数第N个节点A的值是>=x的，A后面所有节点的值都是<x的
         * 然后rTail.next最终其实就是A.next
         */
		rTail.next = null;
		// 将rHead.next拼接在lTail后面
		lTail.next = rHead.next;
		return lHead.next;
	}
}
