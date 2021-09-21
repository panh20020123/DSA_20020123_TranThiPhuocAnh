public class XucSac {
    public static void main(String[] args) {
        double[] dist = new double[13];
        for (int i = 1; i <= 6; i++)
            for (int j = 1; j <= 6; j++)
                dist[i+j] += 1.0;
        for (int k = 1; k <= 12; k++)
            dist[k] /= 36.0;
        for (int k = 1; k <= 12; k++)
            System.out.print(dist[k]+" ");
        System.out.println("-----------------------------");
        int N = Integer.parseInt(args[0]);
        double [] a = new double[N];
        for(int i=0; i<N; i++)
        {
            int xs1 = (int) (Math.random()*6+1);
            int xs2 = (int) (Math.random()*6+1);
            a[xs1 + xs2] += 1.0 ;
        }
        for(int i=1; i<=12; i++)
            System.out.print(a[i]/N+" ");
    }
}
