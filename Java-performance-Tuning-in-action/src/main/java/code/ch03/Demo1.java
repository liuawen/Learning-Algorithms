package code.ch03;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("");
        List a = new ArrayList();
        a  =  test();
        System.out.println(a);
//        assertSame(str1==str2);
//        assertSame(str2==str3);
//        assertSame(str1==str3);
    }

    private static List test(){
        List a = new ArrayList();
        try{
            a.add(1);
            return a;
        }catch (Exception e){

        }finally {
            a.add(3);
        }
        return a;
    }
}
