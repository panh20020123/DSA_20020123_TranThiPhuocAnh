public class BinomialDistribution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[][] a=new double[n+1][];
        for(int i=1; i<=n; i++)
            a[i]=new double[i];

        a[1][1]=1.0;
        for(int i=1; i<=n; i++) {
            a[i][0] = 0;
            a[0][i] = 0;
        }

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = (a[i - 1][j] + a[i - 1][j - 1]) / 2.0;
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}
