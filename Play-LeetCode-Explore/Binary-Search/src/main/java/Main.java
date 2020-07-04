import java.util.Date;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-22
 */
public class Main {
    public static int binarySearch(int arr[],int n,int target){
        //在[l...r]的范围里寻找target
        int l=0;
        int r=arr.length-1;
        while (l<=r){//当l==r是，区间[l...r]依然是有效的
            int mid = (l+r)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(target>arr[mid]){
                l=mid+1;//target在[mid+1...r]中
            }
            else {
                r=mid-1;//target在[l...mid+1]中
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1000000;
        int[] data = MyUtil.generateOrderedArray(n);
        Date startTime = new Date();
        for (int i = 0; i < n; i++) {
            assert (i==binarySearch(data,n,i));
        }
        Date endTime = new Date();
        long diff = endTime.getTime()-startTime.getTime();
        System.out.println("binarySearch test complete");
        System.out.println("Time test:" + diff + "s");
    }
}
