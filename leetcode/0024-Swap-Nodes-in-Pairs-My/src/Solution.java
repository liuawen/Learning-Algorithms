/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-13
 */
public class Solution {
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }


}
