public class Loops {
    public static void main(String[] args) {
        long N = Long.parseLong(args[0]);
        long x=1;
        while (x <= N)
        {
            x*=2;
        }
        System.out.println(x);

        String ruler = "";
        for (int i = 1; i <= N; i++) {
            ruler = ruler + i + ruler;
            }
        System.out.println(ruler +" "+ ruler.length());

    }
}
