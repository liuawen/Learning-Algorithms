package cn.liuawen;

import javax.swing.*;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-10
 * https://leetcode-cn.com/problems/add-two-numbers/
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 通过次数441,971提交次数1,178,356
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * eg:
 *4 5 9 null
 *3 8 null
 *7 3 0 1 null
 * 2个null结束
 */
public class _0002_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        //虚拟节点 简洁  效率
        ListNode dummyHead = new ListNode(0);
        ListNode last = dummyHead;
        //进位值
        int carry = 0;
        while (l1!=null || l2!=null){
            int v1=0;
            if (l1!=null){
                v1=l1.val;
                l1=l1.next;
            }
            int v2=0;
            if (l2!=null){
                v2=l2.val;
                l2=l2.next;
            }

            int sum = v1  + v2 + carry;
            //设置进位值
            carry = sum / 10;
            //sum的个位数作为新节点的值
            last.next=new ListNode(sum%10);
            last=last.next;
        }
        //检查最后的进位
        if(carry>0){
            //carry=1
            last.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
}
