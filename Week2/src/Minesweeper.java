import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        int [][] a=new int[m+2][n+2];
        for(int i=1; i<=m; i++) {
            for (int j = 1; j <=n; j++) {
                if (StdRandom.bernoulli(p / 100.0))
                {System.out.print("* "); a[i][j]=-1;}
                else {System.out.print(". "); a[i][j]=0;}
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=m; i++)
            for(int j=1; j<=n; j++)
            {
                if(a[i][j]==0)
                {
                    if( a[i-1][j] == -1 ) a[i][j]++;
                    if( a[i-1][j+1] == -1 ) a[i][j]++;
                    if( a[i-1][j-1] == -1 ) a[i][j]++;
                    if( a[i][j+1] == -1 ) a[i][j]++;
                    if( a[i][j-1] == -1 ) a[i][j]++;
                    if( a[i+1][j]==-1 ) a[i][j]++;
                    if( a[i+1][j+1]==-1 ) a[i][j]++;
                    if( a[i+1][j-1]==-1 ) a[i][j]++;
                }
            }
        for(int i=1; i<=m; i++) {
            for (int j = 1; j <= n; j++)
                if(a[i][j]==-1) System.out.print("* ");
                else System.out.print(a[i][j]+" ");
            System.out.println();
        }

    }
}
