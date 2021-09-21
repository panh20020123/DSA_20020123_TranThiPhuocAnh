public class Euler {
    public static void main(String[] args) {
        double k = Math.pow(Long.MAX_VALUE, 1.0/5);
        long n = 250;

        for(long a=1; a<=n; a++)
            for(long b=a+1; b<=n; b++)
                for(long c=b+1; c<=n; c++)
                    for(long d=c+1; d<=n; d++)
                        for(long e=d+1; e<=n; e++)
                        {
                             double x= a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d;
                             double p = e*e*e*e*e;
                             if(x==p) System.out.println(a+" "+b+" "+" "+c+" "+d+" = "+e);

                        }

    }
}
