public class Binary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // set v to the largest power of two that is <= n
        int v = 1;
        while (v <= n / 2) {
            v = v * 2;
        }
        // check for presence of powers of 2 in n, from largest to smallest
        while (v > 0) {
            // v is not present in n
            if (n < v) {
                System.out.print(0);
            }
            // v is present in n, so remove v from n
            else {
                System.out.print(1);
                n = n - v;
            }
            v = v / 2;
        }
        System.out.println();
    }
}
