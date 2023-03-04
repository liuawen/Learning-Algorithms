import java.lang.module.ResolutionException;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-07
 *
 * 我们创建两个指针i和j，第一次遍历的时候指针j用来记录当前有多少非0元素。即遍历的时候每遇到一个非0元素就将其往数组左边挪，第一次遍历完后，j指针的下标就指向了最后一个非0元素下标。
 * 第二次遍历的时候，起始位置就从j开始到结束，将剩下的这段区域内的元素全部置为0。
 * 动画演示：
 *
 */
class Solution1 {
    public static void main(String[] args) {

    }
    public static void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }
    }
}
