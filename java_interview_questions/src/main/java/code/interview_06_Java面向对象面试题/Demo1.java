package main.java.code.interview_06_Java面向对象面试题;

/**
 * @description
 * @create 2023-04-05
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println("i = " + i + ", j = " + j);
                    if (j == 5) {// 满足一定条件抛异常
                        throw new RuntimeException("test exception for j = 5");
                    }
                }
            }
        } catch (RuntimeException e) { //循环外层捕获异常
            e.printStackTrace();
        }
    }
}
