import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

import java.util.Arrays;

public class Sum2 {
    public static void main(String[] args) {
        In in = new In ("D:\\algs4-data\\8Kints.txt"); //tao luong doc
        int[] a = in.readAllInts(); // doc vao mang a
        int n= a.length;
        Arrays.sort(a);
        for(int i=0; i<n-2; i++)
        for(int j=i+1; j<n-1; j++)
        {
            /*int dau = j+1;
            int cuoi = n-1;
            while (dau<=cuoi)
            {
                int giua = (dau + cuoi)/2;
                if (a[i]+a[giua]+a[j]==0) {System.out.println(a[i]+" "+a[j]+" "+a[giua]); break;}
                else if(a[i]+a[j]+a[giua] < 0) dau = giua+1;
                else if(a[i]+a[j]+a[giua] > 0) cuoi = giua-1;

            }*/
            int x=Arrays.binarySearch(a, j+1, n-1, -(a[i]+a[j]));
            if(x>=0) System.out.println(a[i]+" "+a[j]+" "+a[x]);
        }

        //StdArrayIO.print(a); // in mang a ra mh
    }
}

