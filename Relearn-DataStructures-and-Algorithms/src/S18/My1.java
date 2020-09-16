package S18;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-24
 */
public class My1 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5};
        int temp = nums[0];
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                nums[len] = nums[i];
                temp = nums[i];
                len++;
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
