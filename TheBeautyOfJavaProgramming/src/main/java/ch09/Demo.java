package ch09;

import org.openjdk.jol.info.ClassLayout;
/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-25
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(
                ClassLayout.parseInstance(new MyObject()).toPrintable());
    }
}
