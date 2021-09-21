
public class fibonacci {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        if(n==1|| n==0) {
            System.out.println(n);
        }
        if(n<0)
        {
            System.out.println(-1);
        }
        if(n>92) System.out.println(Long.MAX_VALUE);
        long[] f=new long[95];
        f[0]=0; f[1]=1;
        for(int i=2; i<=n; i++)
        {
            f[i]=f[i-1]+f[i-2];
            if( f[i]>=(Math.pow(2, 63)-1) ) System.out.println(i);
        }

    }
}
