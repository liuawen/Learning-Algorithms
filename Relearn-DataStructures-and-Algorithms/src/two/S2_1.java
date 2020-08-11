package two;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-11
 */
public class S2_1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= (100 / 7); i++) {
            for (int j = 0; j <= (100 / 3); j++) {
                for (int k = 0; k <= (100 / 2); k++) {
                    if (i * 7 + j * 3 + k * 2 == 100) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
