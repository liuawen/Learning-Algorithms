/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-11
 */
class Solution {
    public boolean find(int[] nums, int target, int index){
        if( target == 0) return true;
        for(int i=index; i<nums.length; i++){
            if(target-nums[i]<0) return false;
            if(find(nums, target-nums[i], i+1)) return true;
        }
        return false;
    }
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int num: nums) total+=num;
        if(total %2 !=0) return false;
        if(total==0) return true;
        return find(nums, total/2, 0);
    }
}

