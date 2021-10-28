import java.util.Scanner;

public class FindtheMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n/2;

        int[] a = new int[n];
        int i = 0;
        while (i != n)
        {
            int s = in.nextInt();
            a[i++] = s;
        }

        sort(a, 0, n-1, m);

        in.close();
    }

    public static void sort(int[] a, int lo, int hi, int m) {

        if (hi == lo && lo == m) {
            System.out.println(a[m]);
            return;
        }
        if (hi < lo) return;
        int j = partition(a, lo, hi);
        if (j == m) {
            System.out.println(a[m]);
            return;
        }
        sort(a, lo, j-1, m);
        sort(a, j+1, hi, m);
    }

    public static int partition(int[] a, int lo, int high) {
        int pivot = a[high];
        int i = lo;
        for (int j = lo; j <= high-1; j++) {
            if (a[j] <= pivot) {
                exch(a, i, j);
                i++;
            }
        }
        exch(a, i, high);
        return i;
    }
    public static void exch(int[] a, int j, int i) {
        int x = a[j];
        a[j] = a[i];
        a[i] = x;
    }

}
