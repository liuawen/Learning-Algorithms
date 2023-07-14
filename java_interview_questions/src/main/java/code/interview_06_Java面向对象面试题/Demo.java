package main.java.code.interview_06_Java面向对象面试题;

/**
 * @description
 * @create 2023-04-05
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("hello");
        label:      //标记
//        System.out.println("hello");
        for (int i = 0 ; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if(j == 5) {  //满中一定条件跳到某个标记
                    break label;
                }
            }
        }
        System.out.println("Hi");
    }
}
