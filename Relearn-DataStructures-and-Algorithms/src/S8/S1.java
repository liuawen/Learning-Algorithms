package S8;

import org.junit.Test;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-17
 */
public class S1 {
    @Test
    public void s1() {
        String s = "goodgoogle";
        String t = "google";
        int isfind = 0;

        for (int i = 0; i < s.length() - t.length() + 1; i++) {
            if (s.charAt(i) == t.charAt(0)) {
                int jc = 0;
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    jc = j;
                }
                if (jc == t.length() - 1) {
                    isfind = 1;
                }
            }
        }
        System.out.println(isfind);
    }
}
