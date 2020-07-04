package LanqiaoJavaB._02;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-07-04
 */
public class B2方格计数 {
    public static void main(String[] args) {
        int N = 1000;
        int c = 0;
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                // 轴不算
                if (i == 0 || j == 0) continue;
                if (i * i + j * j <= 1000 * 1000) {
                    c++;
                }
            }
        }
        System.out.println(c);
        c = 0;
        int y = 1000;
        for (int x = 1; x <= 1000; x++) {
            while (x * x + y * y > 1000 * 1000 && y>0) y--;
            c += y;
        }
        System.out.println(c * 4);
    }
}
