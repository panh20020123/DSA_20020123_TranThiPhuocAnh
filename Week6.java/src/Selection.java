import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class Selection
{
    public static void main(String[] args) {
//            In f = new In("D:\\JAVA\\algs4-data\\8Kints.txt");
//            int[] a = f.readAllInts();

        int n = StdIn.readInt();
        int[] a = new int[n];

        for (int i = 0; i< n; i++) {
          //  a[i] = (int) (Math.random() * 99999 + (-9999));
            a[i] = 999;
        }
        //sort(a);

            long start = System.currentTimeMillis();
            sort(a);
            long end = System.currentTimeMillis();


        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
        System.out.println();

            System.out.println(end - start);
    }
    public static void sort(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (less(a[j], a[min]))
                    min = j;
            exch(a, i, min);
        }
    }

    public static void sort1(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (a[j] > a[min])
                    min = j;
            exch(a, i, min);
        }
    }

    private static boolean less(int x, int y)
    { return x < y; }

    private static void exch(int[] a, int i, int j)
    {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

}
