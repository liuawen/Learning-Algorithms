/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class Solution2 {
    //递归方式解决
    //我们知道，如果对链表逆序打印可以这样写  后到前打印
    //最先打印链表的尾节点 后到前遍历

    /*
    也就是说最先打印的是链表的尾结点，他是从后往前打印的，
    如果以后谁再给你说单向链表不能从后往前遍历，你就拿这段代码怼他，哈哈。
    看到这里是不是有灵感了，我们来对上面的对面进行改造一下
     */
    private void printListNode(ListNode head) {
        if (head == null)
            return;
        printListNode(head.next);
        System.out.println(head.val);
    }
    ListNode temp;

    public boolean isPalindrome(ListNode head) {
        temp = head;
        return check(head);
    }

    private boolean check(ListNode head) {
        if (head == null)
            return true;
        boolean res = check(head.next) && (temp.val == head.val);
        temp = temp.next;
        return res;
    }


}
