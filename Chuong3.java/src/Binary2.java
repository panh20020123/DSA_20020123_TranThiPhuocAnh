public class Binary2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // set v to the largest power of two that is <= n
        int x=14;
        String[] k={ "A", "B", "C", "D", "E", "F" };
        String s ="";
        while (n>0)
        {
            if(n%x>=10) s += k[ (n%x)-10 ];
                    else s += n%x;
            n /= x;
        }

        System.out.println(s);
    }
}
