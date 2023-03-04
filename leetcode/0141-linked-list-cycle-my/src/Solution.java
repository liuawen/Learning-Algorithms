/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-09
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fastp = head.next;
        ListNode slowp = head;
        while (fastp != null && fastp.next != null) {
            if (fastp == slowp) {
                return true;
            }
            fastp = fastp.next.next;
            slowp = slowp.next;
        }
        return false;
    }
}
