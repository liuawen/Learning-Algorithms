package code.ch01;

/**
 * @description
 * @create 2023-03-04
 */
public class Demo {
    public static void main(String[] args) {
        String string = "我是string";
        String s1 = new String("Java");
        String s2 = s1.intern();
        String s3 = "Java";
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // true
    }
}
