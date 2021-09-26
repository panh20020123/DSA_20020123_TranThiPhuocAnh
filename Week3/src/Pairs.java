import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        int n = arr.size();
        int kq = 0;
        int[] a = new int[n];

        for (int i=0; i < n; i++) {
            a[i] = arr.get(i);
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++)
        {
            //int m = a[i]+k;
            int s = Arrays.binarySearch(a,a[i] + k);
            if(s >= 0) kq++;
        }
        return kq;
    }
}
