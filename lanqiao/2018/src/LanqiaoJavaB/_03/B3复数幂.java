package LanqiaoJavaB._03;
/*

标题：复数幂

设i为虚数单位。对于任意正整数n，(2+3i)^n 的实部和虚部都是整数。
求 (2+3i)^123456 等于多少？ 即(2+3i)的123456次幂，这个数字很大，要求精确表示。



答案写成 "实部±虚部i" 的形式，实部和虚部都是整数（不能用科学计数法表示），中间任何地方都不加空格，实部为正时前面不加正号。(2+3i)^2 写成: -5+12i，
(2+3i)^5 的写成: 122-597i


注意：需要提交的是一个很庞大的复数，不要填写任何多余内容。


 */

import java.math.BigInteger;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-07-04
 */
public class B3复数幂 {
    public static void main(String[] args) {
        //设i为虚数单位。对于任意正整数n，(2+3i)^n 的实部和虚部都是整数。
        //求 (2+3i)^123456 等于多少？ 即(2+3i)的123456次幂，这个数字很大，要求精确表示。
        //eg: (2+3i)*(2+3i) 2*2-3*3 2*3i+3i*2
        BigInteger two = BigInteger.valueOf(2);
        BigInteger three = BigInteger.valueOf(3);

        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(3);
        BigInteger aa = null;
        BigInteger bb = null;
        //123456-2+1 123455
        for (int i = 0; i < 123455; i++) {
            aa = a.multiply(two).subtract(b.multiply(three));// a*2-(b*3)
            bb = a.multiply(three).add(b.multiply(two));
            a = aa;
            b = bb;
        }
        System.out.println(aa + (bb.compareTo(BigInteger.ZERO) < 0 ? "-" : "+") + bb + "i");
    }
}
