package 链表;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 
 * @author MJ
 *
 */
public class _0203_移除链表元素 {
//	public ListNode removeElements(ListNode head, int val) {
//		if (head == null) return null;
//		
//		// 新链表的头结点
//		ListNode newHead = null;
//		// 新链表的尾结点
//		ListNode newTail = null;
//		
//		while (head != null) {
//			if (head.val != val) {
//				// 将head拼接到newTail的后面
//				if (newTail == null) {
//					newHead = head;
//					newTail = head;
//				} else {
//					newTail.next = head;
//					newTail = head;
//				}
//			}
//			head = head.next;
//		}
//		if (newTail == null) {
//			return null;
//		} else {
//			// 尾结点的next要清空
//			newTail.next = null;
//		}
//		return newHead;
//	}
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		// 新链表的头结点
		ListNode newHead = new ListNode(0);
		// 新链表的尾结点
		ListNode newTail = newHead;
		while (head != null) {
			if (head.val != val) {
				newTail.next = head;
				newTail = head;
			}
			head = head.next;
		}
		newTail.next = null;
		return newHead.next;
	}
}
