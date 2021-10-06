import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Closest {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double xx = Double.NaN;
        double yy = Double.NaN;
        double zz = Double.NaN;
        double kq = Double.POSITIVE_INFINITY;

        while (!StdIn.isEmpty()) {
            double xi = StdIn.readDouble();
            double yi = StdIn.readDouble();
            double zi = StdIn.readDouble();
            double s = (x - xi) * (x - xi) + (y - yi) * (y - yi) + (z - zi) * (z - zi);
            if (s < kq) {
                xx = xi;
                yy = yi;
                yy = zi;
                zz = s;
            }
        }

        // output
        StdOut.printf("Closest point = (%f, %f, %f)\n", xx, yy, yy);
    }
}
