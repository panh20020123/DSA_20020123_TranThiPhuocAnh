public class PowersOfK {
    public static void main(String[] args) {
        long k = Long.parseLong(args[0]);
        long i=0;
        while( Math.pow(k, i) < Long.MAX_VALUE )
        {
            System.out.println(i);
            i++;
        }
        System.out.println(i/1.0);
    }
}
