import java.util.Arrays;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-16
 *     //给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *     输入：[-4,-1,0,3,10]
 *     输出：[0,1,9,16,100]
 *     输入：[-7,-3,2,3,11]
 *     输出：[4,9,9,49,121]
 */
public class Solution {
    public static void main(String[] args) {
        int[] A = new int[]{-4,-1,0,3,10};
        A = Solution.sortedSquares(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
    //先计算平方，然后在排序
    public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = A[i] * A[i];
        }
        Arrays.sort(res);
        return res;
    }
}
