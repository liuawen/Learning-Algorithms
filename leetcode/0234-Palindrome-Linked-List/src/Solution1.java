import java.util.Stack;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class Solution1 {
    /*
    使用栈解决
    我们知道栈是先进后出的一种数据结构，这里还可以使用栈先把链表的节点全部存放到栈中，
    然后再一个个出栈，这样就相当于链表从后往前访问了，通过这种方式也能解决
    这里相当于链表从前往后全部都比较了一遍，其实我们只需要拿链表的后半部分和前半部分比较即可，
    没必要全部比较，所以这里可以优化一下
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        //链表的长度
        int len = 0;
        //把链表节点的值存放到栈中
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
            len++;
        }
        //len长度除以2
        len >>= 1;
        //然后再出栈
        while (len-- >= 0) {
            if (head.val != stack.pop())
                return false;
            head = head.next;
        }
        return true;
    }

}
