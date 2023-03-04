/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-06
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 * https://leetcode-cn.com/problems/sum-of-square-numbers/description/
 */
public class MySolution1 {
    public static void main(String[] args) {
       MySolution1 mySolution1  = new MySolution1();
       System.out.println(mySolution1.judgeSquareSum(5));
    }
    public boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0;
        int j = (int) Math.sqrt(target);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                return true;
            } else if (powSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
