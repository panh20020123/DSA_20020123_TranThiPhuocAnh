import edu.princeton.cs.algs4.In;

import java.util.Arrays;
import java.util.List;

public class Quicksort1 {
    public static List<Integer> quickSort(List<Integer> arr) {
        int i = 0, j = arr.size();
        int n = arr.size();

        Integer[] a = new Integer[n];
        for (int t = 0; t<n; t++) {
            a[t] = arr.get(t);
        }
        while (true) {
            while (a[++i] < a[0])
                if (i == n) break;
            while (a[0] < a[--j])
                if (j == 0) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, 0, j);
        return Arrays.asList(a);
    }
    public static void exch(Integer[] a, int j, int i) {
        int x = a[j];
        a[j] = a[i];
        a[i] = x;
    }
}
