package two;

import org.junit.Test;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-11
 */
public class S2_2 {
    public static void main(String[] args) {
            int count = 0;
            for (int i = 0; i <= (100 / 7); i++) {
                for (int j = 0; j <= (100 / 3); j++) {
                    if ((100-i*7-j*3 >= 0)&&((100-i*7-j*3) % 2 == 0)) {
                        count += 1;
                    }
                }
            }
            System.out.println(count);
    }
    @Test
    public void s2_2() {
        int count = 0;
        for (int i = 0; i <= (100 / 7); i++) {
            for (int j = 0; j <= (100 / 3); j++) {
                if ((100-i*7-j*3 >= 0)&&((100-i*7-j*3) % 2 == 0)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
