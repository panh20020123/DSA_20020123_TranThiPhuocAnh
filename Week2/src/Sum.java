import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        In in = new In ("D:\\algs4-data\\2Kints.txt"); //tao luong doc
        int[] a = in.readAllInts(); // doc vao mang a
        int n= a.length;
        Arrays.sort(a);

        for(int i=0; i<n-1; i++)
        {
            /*int dau = i+1;
            int cuoi = n-1;
            while (dau<=cuoi)
            {
                int giua = (dau + cuoi)/2;
                if (a[i]+a[giua]==0) {System.out.println(a[i]+" "+a[giua]); break;}
                else if(a[i]+a[giua] < 0) dau = giua+1;
                else if(a[i]+a[giua] > 0) cuoi = giua-1;
            }*/
            int x=Arrays.binarySearch(a, i+1, n-1, -a[i]);
            if(x>=0) {System.out.println( a[i]+ " "+a[x] );}
        }

        //StdArrayIO.print(a); // in mang a ra mh
    }
}




/*
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.List;
import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        int i=0;
        List<Integer> a= new ArrayList<Integer>();
        while(!StdIn.isEmpty())
        {
            i++;
            a.add(StdIn.readInt());
        }
        for(int j1=1; j1<i-1; j1++ )
            for(int j2=j1+1; j2<i; j2++)
                for(int j3=j2+1; j3<=i; j3++)
                {
                    if(a.get(j1)+a.get(j2)+a.get(j3) == 0)
                        System.out.println(a.get(j1) + " "+ a.get(j2)+ " "+ a.get(j3));
                }
    }
}
*/
