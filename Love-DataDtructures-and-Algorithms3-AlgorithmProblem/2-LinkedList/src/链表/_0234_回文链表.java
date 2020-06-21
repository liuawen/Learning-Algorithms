package 链表;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * 
 * @author MJ
 *
 */
public class _0234_回文链表 {
    public boolean isPalindrome(ListNode head) {
    	if (head == null || head.next == null) return true; 
    	if (head.next.next == null) return head.val == head.next.val;
    	
    	// 找到中间节点
    	ListNode mid = middleNode(head);
    	// 翻转右半部分（中间节点的右边部分）
    	ListNode rHead = reverseList(mid.next);
    	ListNode lHead = head;
    	ListNode rOldHead = rHead;
    	
    	// 从lHead、rHead出发，判断是否为回文链表
    	boolean result = true;
    	while (rHead != null) {
    		if (lHead.val != rHead.val) {
    			result = false;
    			break;
    		}
    		rHead = rHead.next;
    		lHead = lHead.next;
    	}
    	
    	// 恢复右半部分（对右半部分再次翻转）
    	reverseList(rOldHead);
    	return result;
    }

    /**
     * 找到中间节点（右半部分链表头结点的前一个节点）
     * 比如 1>2>3>2>1中的3是中间节点
     * 比如 1>2>2>1中左边第一个2是中间节点
     * @param head
     * @return
     */
	private ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	/**
	 * 翻转链表
	 * @param head 原链表的头结点
	 * 比如原链表：1>2>3>4>null，翻转之后是：4>3>2>1>null
	 * @return 翻转之后链表的头结点（返回4）
	 */
	private ListNode reverseList(ListNode head) {
		ListNode newHead = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
		return newHead;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
//		head.next.next.next.next = new ListNode(1);
		System.out.println(head);
		
		_0234_回文链表 obj = new _0234_回文链表();
		obj.isPalindrome(head);
		
		System.out.println(head);
	}
}
