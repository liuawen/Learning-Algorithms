import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-27
 */
public class Solution1 {
    //快速排序
    //我们也可以将数组排序，并记录每一个数在原数组中的位置。对于排序后的数组中的每一个数，我们找出其左侧第一个小于它的数，这样就能够知道数组中小于该数的数量。
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = nums[i];
            data[i][1] = i;
        }
        Arrays.sort(data, new Comparator<int[]>() {
            public int compare(int[] data1, int[] data2) {
                return data1[0] - data2[0];
            }
        });

        int[] ret = new int[n];
        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (prev == -1 || data[i][0] != data[i - 1][0]) {
                prev = i;
            }
            ret[data[i][1]] = prev;
        }
        return ret;
    }

}
