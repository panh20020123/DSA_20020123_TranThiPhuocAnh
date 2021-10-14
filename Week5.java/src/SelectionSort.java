import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdIn;

import java.io.File;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = new int[1005];
        In in = new In("D:\\JAVA\\algs4-data\\4Kints.txt");
        a = in.readAllInts();

        long start = System.currentTimeMillis();

        Selection.sort(a);

        long end = System.currentTimeMillis();

        System.out.println(end + " - " + start);
        System.out.println(end  -  start);

    }

}
