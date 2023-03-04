/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-16
 */
public class Solution3 {
    //上面是通过绝对值判断哪个大，其实我们还可以通过相加的方式，如果负数的绝对值大，相加的结果肯定是负数，如果正数的绝对值大，那么相加的结果肯定是正数
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int length = A.length;
        int right = length - 1;
        int index = length - 1;
        int[] res = new int[length];
        while (index >= 0) {
            //判断哪个元素的绝对值大
            if (A[left] + A[right] < 0) {
                res[index--] = A[left] * A[left];
                left++;
            } else {
                res[index--] = A[right] * A[right];
                right--;
            }
        }
        return res;
    }

}
