package design.two;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-14
 */
public class MySingle {
    public static void main(String[] args) {
        MySingle.getInstance();
    }
    private static  MySingle instance;
    private MySingle(){}
    public static MySingle getInstance(){
        if (instance == null){
            synchronized(MySingle.class){
                if(instance==null){
                    System.out.println("我是个傻逼 嗯嗯");
                    return  new MySingle();
                }
            }
        }
        return instance;
    }
}

