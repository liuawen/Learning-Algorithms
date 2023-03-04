/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-04
 */
class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convertToBase7(100));
    }
    public String convertToBase7(int num) {
        String ans = "";
        if (num < 0) {
            num = 0 - num;
            ans += "-";
        }
        StringBuilder sb = new StringBuilder();
      /*  do {
            int mod = num % 7;
            sb.append((char)('0'+mod));
            num = num / 7;
        } while (num > 0);*/
        //为什么不直接  do while 呢
        if (num == 0){
            sb.append('0');
        }

        while (num > 0){
            int mod = num % 7;
            sb.append((char)('0'+mod));
            num = num / 7;
        }

        ans += sb.reverse().toString();
        return ans;

    }
}
