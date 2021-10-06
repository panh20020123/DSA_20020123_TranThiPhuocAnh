import edu.princeton.cs.algs4.StdDraw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlotFilter3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\JAVA\\algs4-data\\USA.txt"));

        // read in bounding box and rescale
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        // for bigger points
        StdDraw.setPenRadius(0.005);

        // to speed up performance, defer displaying points
        StdDraw.enableDoubleBuffering();

        // plot points, one at a time
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            StdDraw.point(x, y);
        }

        // display all of the points now
        StdDraw.show();

    }
}
