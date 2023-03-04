/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-28
 */
public class Solution1 {
    public static void main(String[] args) {
        Object value = "N";
//        System.out.println(value.equals("N"));
//        System.out.println(((String)value).equals("N"));
        if( value.equals("N")){
            System.out.println(UFBoolean.valueOf(((String) value)));
        }else{
            System.out.println(UFBoolean.valueOf(((String[]) value)[0]));
        }


        UFBoolean u = UFBoolean.valueOf(false);
        UFBoolean u1= UFBoolean.valueOf("N");
//        System.out.println(u);
//        System.out.println(u1);
    }

}
