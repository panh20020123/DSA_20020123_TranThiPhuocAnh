import java.util.Arrays;

public class ShufflingTest {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]); // choose this manyelements
        int N = Integer.parseInt(args[1]); // from 0, 1, ..., N-1

        int[] perm = new int[N];
        for (int i = 0; i < N; i++)
            perm[i] = i;

        int [][] p = new int[N][N];

        for (int i = 0; i < M; i++) {
            //int r = i + (int) (Math.random() * (N-i));
            int r = (int) (Math.random() * N);
            p[perm[i]][r]++;
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }
        //System.out.println(Arrays.deepToString(p));
        /*for (int i = 0; i < M; i++)
            System.out.print(perm[i] + " ");
        System.out.println();*/
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
            {
                double  x= p[i][j];
                System.out.println( x/M );
            }

    }

}
