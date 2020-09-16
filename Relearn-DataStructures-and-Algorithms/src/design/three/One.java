package design.three;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-14
 */
public class One {
    public static void main(String[] args) {
        int a;
        //Error:(10, 28) java: 可能尚未初始化变量a
        int[] aa = new int[5];
        System.out.println(aa[0]);//0
    }
}
