import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i=0;
        String kq = null;
        while(!StdIn.isEmpty())
        {
            i++;
            String a= StdIn.readString();
            if(StdRandom.bernoulli(1.0/i)) kq = a;
        }
        System.out.println(kq);
    }
}
