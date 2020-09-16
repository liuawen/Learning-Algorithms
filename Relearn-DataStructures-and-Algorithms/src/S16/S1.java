package S16;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-24
 */
public class S1 {
    public static void main(String[] args) {
        int x = 40;
        System.out.println(fun(x));
        //40  63245986  大一点就顶不住了 怎么办呢
    }

    public static int fun(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2){
            return 1;
        }
        return fun(n - 1) + fun(n - 2);
    }
}
