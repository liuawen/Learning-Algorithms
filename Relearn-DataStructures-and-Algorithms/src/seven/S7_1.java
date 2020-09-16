package seven;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-15
 */
public class S7_1 {
    public void getScore() {
        int a[] = { 2, 1, 4, 5, 3 };
        int max_inx = -1;
        int max_val = -1;
        int min_inx= -1;
        int min_val = 99;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max_val) {
                max_val = a[i];
                max_inx = i;
            }
            if (a[i] < min_val) {
                min_val = a[i];
                min_inx = i;
            }
        }

        int inx1 = max_inx;
        int inx2 = min_inx;
        if (max_inx < min_inx){
            inx1 = min_inx;
            inx2 = max_inx;
        }
        for (int i = inx1; i < a.length-1; i++) {
            a[i] = a[i+1];
        }
        for (int i = inx2; i < a.length-1; i++) {
            a[i] = a[i+1];
        }
        int sumscore = 0;
        for (int i = 0; i < a.length-2; i++) {
            sumscore += a[i];
        }
        double avg = sumscore/3.0;
        System.out.println(avg);
    }
}
