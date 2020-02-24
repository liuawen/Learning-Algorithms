
/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-02-16 0:02
 */
public class Main {
    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0 ; i < 5 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);
        }
        System.out.println("-----------");
        System.out.println("isEmpty：" + queue.isEmpty());
        System.out.println("Size：" +  queue.getSize());
        System.out.println(queue);
        System.out.println("队首元素：" + queue.getFront());
        System.out.println(queue);
        System.out.println("----------");
        for(int i = 0 ; i < 5 ; i ++){
            System.out.println(queue);
            queue.dequeue();
        }
        System.out.println(queue);
    }
}
