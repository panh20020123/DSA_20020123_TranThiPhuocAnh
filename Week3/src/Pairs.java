import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        int n = arr.size();
        int kq = 0;
        //Collections.sort(arr);
        arr.sort((o1,o2) -> o2-o1 );

        for (int i = 0; i < n; i++)
        {
            //int m = a[i]+k;
            if(arr.contains(arr.get(i) + k))
                kq++;
        }
        return kq;
    }
}
