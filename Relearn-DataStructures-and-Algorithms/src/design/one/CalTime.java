package design.one;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-08-13
 */
//模板类
public abstract class CalTime{
    public long getTime(){
        //1、获取开始时间
        long start =  System.currentTimeMillis();
        long startTime = System.currentTimeMillis();


        //2、运行xx代码：这个是不确定的
        doWork();

        //3、获取结束时间
        long end =  System.currentTimeMillis();

        //4、计算时间差
        return end - start;
    }

    protected abstract void doWork();
}