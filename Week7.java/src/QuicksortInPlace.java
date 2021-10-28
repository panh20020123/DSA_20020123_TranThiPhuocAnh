import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class QuicksortInPlace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int i = 0;
        while (i != n)
        {
            a[i++] = in.nextInt();
            System.out.println(a[i-1]);
        }

        sort(a, 0, n-1, n);

        in.close();
    }

    public static void sort(int[] a, int lo, int hi, int n) {

        if (hi <= lo) return;
        int j = partition(a, lo, hi, n);
        sort(a, lo, j-1, n);
        sort(a, j+1, hi, n);
    }

    public static int partition(int[] a, int lo, int high, int n) {
        int pivot = a[high];
        int i = lo;
        for (int j = lo; j <= high-1; j++) {
            if (a[j]<= pivot) {
                exch(a, i, j);
                i++;
            }
        }
        exch(a, i, high);
        for (int t = 0; t < n; t++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        return i;
    }
    public static void exch(int[] a, int j, int i) {
        int x = a[j];
        a[j] = a[i];
        a[i] = x;
    }

}
