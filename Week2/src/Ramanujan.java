public class Ramanujan {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        double x = Math.pow(n, 1.0/3);

        for(long i1=1;i1<=x+1; i1++ )
        for(long i2=i1+1; i2 <= x+1; i2++)
            for(long i3=i2+1; i3<=x+1; i3++)
                for(long i4=i3+1; i4<=x+1; i4++)
                {

                        double t1= Math.pow(i1, 3.0)+Math.pow(i4, 3.0);
                        double t2= Math.pow(i3, 3.0)+Math.pow(i2, 3.0);
                        if(t1==t2 && t1<=n) {

                            System.out.println(i1 + " " + i2 + " = " + i3 + " " + i4);
                    }
                }
    }
}
