import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class TableStudent {
    public static void main(String[] args) {
        System.out.println("Ho va ten         diem Toan   diem Van   diem TB");
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            double x = (a+b)/2.0;
            System.out.print(s + "  " + a + "   " + b + "   " + x);
        }

    }
}
