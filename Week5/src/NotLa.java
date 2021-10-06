import edu.princeton.cs.algs4.StdAudio;

public class NotLa {
    public static void main(String[] args) {
        int SAMPLE_RATE = 44100;
        double[] a = new double[SAMPLE_RATE + 1];
        for (int i = 0; i <= SAMPLE_RATE; i++) {
            a[i] = Math.sin(2 * Math.PI * i * 440 / SAMPLE_RATE);
        }
        StdAudio.play(a);

    }
}
