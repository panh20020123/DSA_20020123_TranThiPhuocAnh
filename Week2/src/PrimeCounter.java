public class PrimeCounter {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        SangNT x=new SangNT(n);
        x.Sang();
        for(int i=2; i<=n; i++)
            if(x.b[i]==true) System.out.println(i);
    }
}
