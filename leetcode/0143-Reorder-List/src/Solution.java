import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-21
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 */
public class Solution {
    //解法一 存储
    //链表的缺点就是不能随机存储，当我们想取末尾元素的时候，只能从头遍历一遍，很耗费时间。第二次取末尾元素的时候，又得遍历一遍。
    //
    //所以先来个简单粗暴的想法，把链表存储到线性表中，然后用双指针依次从头尾取元素即可。
    //
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        //存到 list 中去
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        //头尾指针依次取元素
        int i = 0, j = list.size() - 1;
        while (i < j) {
            list.get(i).next = list.get(j);
            i++;
            //偶数个节点的情况，会提前相遇
            if (i == j) {
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
