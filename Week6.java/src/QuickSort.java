import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
public class QuickSort {
    public static void main(String[] args) {
        In f = new In("D:\\JAVA\\algs4-data\\32KintsD.txt");
        int[] a = f.readAllInts();

//        int n = StdIn.readInt();
//        int[] a = new int[n];
//
//        for (int i = 0; i< n; i++) {
//           a[i] = (int) (Math.random() * 99999 + (-9999));
//         //   a[i] = 999;
//        }

       // shuffle(a);

        int N = a.length;
        int[] b = new int[N];

        for(int i =0; i<N; i++){
            b[i] = a[N-i-1];
        }

        long start = System.currentTimeMillis();
        sort(b, 0, a.length-1);
        long end = System.currentTimeMillis();

        for (int i = 0; i < a.length; i++)
            System.out.println(b[i] + "  ");
        System.out.println();

        System.out.println(end - start);
    }

    public static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi+1;
        while (true) {
            while (a[++i] < a[lo])
                if (i == hi) break;
            while (a[lo] < a[--j])
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void sort(int[] a, int lo, int hi) {

        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    public static void exch(int[] a, int j, int i) {
        int x = a[j];
        a[j] = a[i];
        a[i] = x;
    }

    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i<N; i++) {
            int r = StdRandom.uniform(i + 1);
            exch(a, i , r);
        }
    }
}
