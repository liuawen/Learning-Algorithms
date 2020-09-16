package S16;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-24
 */
public class S2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        System.out.println(bs(arr, target, 0, arr.length - 1));
    }

    private static int bs(int[] arr, int target, int begin, int end) {
        if (begin == end) {
            if (target == arr[begin]) {
                return begin;
            } else {
                return -1;
            }
        }
        int middle = (begin + end) / 2;
        if (target == arr[middle]) {
            return middle;
        }
        if (arr[begin] <= arr[middle - 1]) {
            if (arr[begin] <= target && target <= arr[middle - 1]) {
                return bs(arr, target, begin, middle - 1);
            } else {
                return bs(arr, target, middle + 1, end);
            }
        } else {
            if (arr[middle + 1] <= target && target <= arr[end]) {
                return bs(arr, target, middle + 1, end);
            } else {
                return bs(arr, target, begin, middle - 1);
            }
        }
    }
}
