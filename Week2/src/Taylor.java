public class Taylor {
    public static void main(String[] args) {
        int n = 100005;
        double kqmu= 1.0;
        double kqsin=0.0;
        double kqcos=1.0;
        double x= Double.parseDouble(args[0]);
        if(x==0) {
            System.out.println(1.0);
            return;
        }
        double thua=1.0;
        double mu=1.0;
        for(int i=1; i<=n; i++)
        {
            if(mu*x <= Double.MAX_VALUE && thua*i <= Double.MAX_VALUE) {
                mu *= x;
                thua *= i;
            }
            else break;
            kqmu+= mu/thua;
            if(i%2==1) {
                int t=(i-1)/2;
                if(t%2==1) kqsin -= mu/thua;
                else kqsin += mu/thua;
            }
            if(i%2==0)
            {
                int t=i/2;
                if(t%2==1) kqcos -= mu/thua;
                else kqcos += mu/thua;
            }
        }
        //System.out.println(mu);
        System.out.println(kqmu);
        System.out.println(kqsin);
        System.out.println(kqcos);
        //input radian
    }
}
