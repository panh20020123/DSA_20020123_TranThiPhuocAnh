import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import java.util.Arrays;

public class ThreeSum2 {
    public static void printAll(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int l, r;

        for (int i = 0; i < n - 2; i++) {
            l = i + 1;
            r = n - 1;
            while (l < r) {
                if (a[i] + a[l] + a[r] == 0) {
                    System.out.println(a[i] + ", " + a[l] + ", " + a[r]);
                    l++;
                    r--;
                } else if (a[i] + a[l] + a[r] < 0) {
                    l++;
                } else { // A[i] + A[l] + A[r] > 0
                    r--;
                }
            }
        }
    }

    public static void main(String[] args) {
        In in = new In ("D:\\algs4-data\\8Kints.txt"); //tao luong doc
        int[] a = in.readAllInts(); // doc vao mang a
        printAll(a);
    }
}

