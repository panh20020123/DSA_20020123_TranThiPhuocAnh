import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class FirstDraw {
    /**
     * Ve tam giac vs 1 diem ben trong.
     * @param args dau vao
     */
    public static void main(String[] args) {
        // thay doi he toa do
        StdDraw.setXscale(0, 2);
        StdDraw.setYscale(0, 2);

        //thay doi do day
        StdDraw.setPenRadius(0.1);

        //thay doi mau cua Pen
        StdDraw.setPenColor(Color.pink);

        // ve
        double t = Math.sqrt(3.0)/2.0;
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, t);
        StdDraw.line(0.5, t, 0.0, 0.0);
        StdDraw.point(0.5, t/3.0);
    }
}
