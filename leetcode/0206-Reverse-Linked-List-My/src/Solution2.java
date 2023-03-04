/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-21
 * 递归解法
 * 这题有个很骚气的递归解法，递归解法很不好理解，这里最好配合代码和动画一起理解。
 * 递归的两个条件：
 *
 * 终止条件是当前节点或者下一个节点==null
 * 在函数内部，改变节点的指向，也就是 head 的下一个节点指向 head 递归函数那句
 */
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        //递归终止条件是当前为空，或者下一个节点为空
        if(head==null || head.next==null) {
            return head;
        }
        //这里的cur就是最后一个节点
        ListNode cur = reverseList(head.next);
        //这里请配合动画演示理解
        //如果链表是 1->2->3->4->5，那么此时的cur就是5
        //而head是4，head的下一个是5，下下一个是空
        //所以head.next.next 就是5->4
        head.next.next = head;
        //防止链表循环，需要将head.next设置为空
        head.next = null;
        //每层递归函数都返回cur，也就是最后一个节点
        return cur;
    }
}
