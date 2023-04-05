package code.ch23;

/**
 * @description
 * @create 2023-04-03
 */
public class Demo {
    public static void main(String[] args) {
        StringBuffer s = createString1();
        s = new StringBuffer("haha");
        System.out.println(s);

        String ss = createString2();

    }
    public static StringBuffer createString1() {
        StringBuffer sb = new StringBuffer();
        sb.append("Java");
        return sb;
    }
    public static String createString2() {
        StringBuffer sb = new StringBuffer();
        sb.append("Java");
        return sb.toString();
    }
}
