import java.util.Arrays;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-17
 */
public class Solution1 {


    int res = 0;

    public int totalNQueens(int n) {
        int[] used = new int[n];
        int[] path = new int[n];
        Arrays.fill(path, -1);
        int flag = 0;
        for (int i = 0; i < (n + 1) / 2; i++) { //仅需遍历一半！！！
            if (i == (n / 2)) flag = res; //n为奇数时，当遍历到中间时，记录一下之前有多少个res;n为偶数走不到这一步。
            used[i] = 1;
            path[0] = i;
            backTrace(used, i, 1, n, path);
            path[0] = -1;
            used[i] = 0;
        }
        if ((n & 1) == 0) return res * 2; //n为偶数时，直接是前一半结果乘2
        return flag * 2 + (res - flag);//n为奇数时，我们之前记录的flag乘2,加上以中间值为起点的时候回溯的结果(res-flag)

    }


    public void backTrace(int[] used, int last, int rowid, int n, int[] path) {
        if (rowid == n) {
            res++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (used[i] == 1) continue; //判断该列是否已经有过了
            if (i == last || (last > 0 && i == last - 1) || (last < n - 1 && i == last + 1)) continue; //判断竖向，斜向问题
            if (rowid > 1) { //判断是否有跨行的斜向问题
                int j = rowid - 2;
                for (; j >= 0; j--) {
                    if (i - path[j] == rowid - j || path[j] - i == rowid - j) break;
                }
                if (j >= 0) continue;
            }
            used[i] = 1;
            path[rowid] = i;
            backTrace(used, i, rowid + 1, n, path);
            path[rowid] = -1;
            used[i] = 0;
        }
    }

}
