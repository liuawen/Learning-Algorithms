import java.util.PriorityQueue;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-11
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,4,2,1,5};
        int n = Solution1.findKthLargest(nums,1);
        System.out.println(n);
        System.out.println("-----------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static  int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 小顶堆
        for (int val : nums) {
            pq.add(val);
            if (pq.size() > k)  // 维护堆的大小为 K
                pq.poll();
        }
        return pq.peek();
    }
}
