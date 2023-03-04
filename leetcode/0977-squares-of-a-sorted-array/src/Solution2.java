/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-16
 */
public class Solution2 {
    //上面的两种解决方式效率不是很高，因为这个数组不是无序的，它是非递减的，
    // 也就是说如果没有重复的元素，这个数组是递增的。
    // 如果都是正数，肯定是值越大平方越大，但如果有负数就不一样了，因为-3的平方要大于2的平方。
    // 所以我们可以使用两个指针，分别从数组的两端判断哪个元素的绝对值大，绝对值大的先计算，看下代码
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int length = A.length;
        int right = length - 1;
        int index = length - 1;
        int[] res = new int[length];
        while (index >= 0) {
            //判断哪个元素的绝对值大
            if (Math.abs(A[left]) > Math.abs(A[right])) {
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
