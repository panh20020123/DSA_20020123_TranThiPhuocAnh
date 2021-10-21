import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class MergeSort {
    public static void main(String[] args) {
        In f = new In("D:\\JAVA\\algs4-data\\16Kints.txt");
        int[] a = f.readAllInts();

//        int n = StdIn.readInt();
//        int[] a = new int[n];
//
//        for (int i = 0; i< n; i++) {
//            //a[i] = (int) (Math.random() * 9999);
//            a[i] = 999;
//        }

         int[] aux = new int[a.length];
         int[] aux1 = new int[a.length];
        sort(a, aux, 0, a.length-1);

        int[] ab = new int[a.length];
        int l = a.length;
//
        for (int i = 0; i < l; i++)
            ab[i] = a[l-i-1];

        long start = System.currentTimeMillis();
        sort(ab, aux1, 0, ab.length-1);
        long end = System.currentTimeMillis();

        for (int i = 0; i < ab.length; i++)
            System.out.print(ab[i] + "  ");
        System.out.println();

        System.out.println(end - start);
    }

    public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (a[j]<a[i]) a[k]=aux[j++];
            else a[k] = aux[i++];
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
