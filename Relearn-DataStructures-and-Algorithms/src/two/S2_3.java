package two;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-11
 */
public class S2_3 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 5, 6 };
        int val_max = -1;
        int time_max = 0;
        int time_tmp = 0;
        for (int i = 0; i < a.length; i++) {
            time_tmp = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    time_tmp += 1;
                }
                if (time_tmp > time_max) {
                    time_max = time_tmp;
                    val_max = a[i];
                }
            }
        }
        System.out.println(val_max);
    }
}
