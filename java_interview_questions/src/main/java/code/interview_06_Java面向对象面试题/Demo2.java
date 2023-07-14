package main.java.code.interview_06_Java面向对象面试题;

/**
 * @description
 * @create 2023-04-05
 */
public class Demo2 {
    public static void main(String[] args) {
        boolean flag = false; //初始化标置变量
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (j == 5) {   //满足一定条件进行设置标置变量
                    flag = true;
                }
                if (flag) { //内层循环判断标置变量
                    break;
                }

            }
            if (flag) {//外层循环判断标置变量
                break;
            }
        }
    }
}
