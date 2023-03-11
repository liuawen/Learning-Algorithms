package code.ch06;

/**
 * @description
 * @create 2023-03-05
 */
public class LockExampleA {
    public static void main(String[] args) {
        synchronized (LockExampleA.class) {
            System.out.println("lock");
        }
    }
}
