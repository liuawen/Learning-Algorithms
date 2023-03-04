/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class JavaSolution {
    public static void main(String[] args) {
        JavaSolution s = new JavaSolution();
        System.out.println(s.intToRoman(3888));//MMMDCCCLXXXVIII
    }
    public String intToRoman(int num) {
        // 初始化了一个一一对应的map，方便后面取出符号。
        String[][] lookup = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };
        String ret = "";
        for (int i = 0; i < 4; i++) {
            ret = lookup[i][num % 10] + ret;
            num /= 10;
        }
        return ret;
    }
}
