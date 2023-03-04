/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-11
 * **快速选择**  ：时间复杂度 O(N)，空间复杂度 O(1)
 */
public class Solution3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,4,2,1,5};
        int n = Solution1.findKthLargest(nums,1);
        System.out.println(n);
        System.out.println("-----------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public  int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) {
                break;
            } else if (j < k) {
                l = j + 1;
            } else {
                h = j - 1;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int l, int h) {
        int i = l, j = h + 1;
        while (true) {
            while (a[++i] < a[l] && i < h) ;
            while (a[--j] > a[l] && j > l) ;
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, l, j);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
