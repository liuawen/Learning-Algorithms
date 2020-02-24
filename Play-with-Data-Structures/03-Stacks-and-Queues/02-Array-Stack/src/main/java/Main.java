public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        for(int i = 0 ; i < 6 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }
        System.out.println("isEmpty：" + stack.isEmpty());
        System.out.println("Size:" + stack.getSize());
        for(int i = 0 ; i < 6 ; i ++){
            stack.pop();
            System.out.println(stack);
        }
        System.out.println("isEmpty：" + stack.isEmpty());

    }
}
