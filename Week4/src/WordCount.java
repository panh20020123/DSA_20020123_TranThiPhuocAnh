import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WordCount {
    public static void main(String[] args) {

        int count = 0;
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
        }

        // output
        StdOut.println("number of words  = " + count);
    }
}
