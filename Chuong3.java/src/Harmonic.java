public class Harmonic {
    public static void main(String[] args) {

        // command -line argument
        int N = Integer.parseInt(args[0]);

        // compute 1/1 + 1/2 + 1/3 + ... + 1/N
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
            }

        // print out Nth harmonic number
        System.out.println(sum);
    }
}
