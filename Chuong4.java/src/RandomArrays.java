public class RandomArrays {
    public static void main(String[] args) {
     int N = Integer.parseInt(args[0]);
    double [] a = new double[N];
     for (int i = 0; i < N; i++) {
        a[i] = Math.random();
     }
    System.out.println("a[]");
    System.out.println("-------------------");
    for (int i = 0; i < N; i++) {
        System.out.println(a[i]);
    }
    System.out.println();
    System.out.println("a = " + a);
    System.out.println();
}
}
