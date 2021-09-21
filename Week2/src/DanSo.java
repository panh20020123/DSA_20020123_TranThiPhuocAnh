public class DanSo {
    public static void main(String[] args) {
        double r =Double.parseDouble(args[0]);
        double k = 1.0- 1.0/r;
        double x= 0.01;
        for(int i=0; i<=100; i++)
        {
            x = r*x*(1-x);
        }
        System.out.println(x-k);
        System.out.println(k);
    }
// 3.5 -0.21134
//3.8 0.206262
//5 x rat lon (infinity)
//1 bang 1-1/r;
}
