import java.util.Arrays;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-16
 */
public class Solution1 {
    //如果嫌代码多还可以一行搞定
    public int[] sortedSquares(int[] A) {
        return Arrays.stream(A).map(a -> a * a).sorted().toArray();
    }
}
