package code.ch06;

/**
 * @description
 * @create 2023-03-05
 */
public class LockExampleB {
    public static void main(String[] args) {
        reentrantA(); // 可重入锁
    }
    /**
     * 可重入锁 A 方法
     */
    private synchronized static void reentrantA() {
        System.out.println(Thread.currentThread().getName() + "：执行 reentrantA");
        reentrantB();
    }
    /**
     * 可重入锁 B 方法
     */
    private synchronized static void reentrantB() {
        System.out.println(Thread.currentThread().getName() + "：执行 reentrantB");
    }
}
