import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class InsertionSort {
    public static void main(String[] args) {
//        In f = new In("D:\\JAVA\\algs4-data\\8Kints.txt");
//        int[] a = f.readAllInts();

        int n = StdIn.readInt();
        int[] a = new int[n];

        for (int i = 0; i< n; i++) {
            //a[i] = (int) (Math.random() * 9999 + (-9999));
            a[i] = 999;
        }

        //Insertion2(a);
        //Insertion(a);


        long start = System.currentTimeMillis();
        Insertion(a);
        long end = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
        System.out.println();

        System.out.println(end - start);
    }


    public static void Insertion2(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++)
            for (int j = i; j > 0; j--) {
                if (a[j - 1] < a[j]) exch(a, j, j-1);
                else break;
            }
      }

    public static void Insertion(int[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++)
            for (int j = i; j > 0; j--) {
                if (a[j-1] > a[j]) exch(a, j, j-1);
                else break;
            }
    }

    public static void exch(int[] a, int j, int i) {
        int x = a[j];
        a[j] = a[i];
        a[i] = x;
    }
}
