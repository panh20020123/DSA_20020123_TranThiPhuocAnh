import java.util.ArrayList;
import java.util.List;

public class ClosetNumber {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        int s = 99999;
        int n = arr.size();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr1[i] = arr.get(i);
        }

        MergeSort.sort(arr1, arr2, 0, n-1);

        for (int i = 1; i < n; i++) {
            int k = Math.abs(arr1[i] - arr1[i-1]);
            s = Math.min(s, k);
        }

        List<Integer> l = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            int k = Math.abs(arr1[i] - arr1[i-1]);
            if (k == s) {
                l.add(arr1[i-1]);
                l.add(arr1[i]);
            }
        }

        // for (int i = 0; i<n; i++)
        // {
        //     l.add(arr1[i]);
        // }

        return l;
    }

}
class MergeSort {
    public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];
            else if (j > hi)               a[k] = aux[i++];
            else if (aux[j] < aux[i])      a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }

    }

    public static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = (lo+hi)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

}
