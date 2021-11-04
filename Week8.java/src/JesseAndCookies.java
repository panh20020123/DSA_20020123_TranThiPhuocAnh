import java.io.*;
import java.util.*;

public class JesseAndCookies {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] line1 = in.nextLine().trim().split(" ");
        String[] line2 = in.nextLine().trim().split(" ");
        int N = Integer.parseInt(line1[0]);
        int K = Integer.parseInt(line1[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(line2[i]));
        }

        int it = 0;
        int min = pq.peek();
        while (min < K) {
            if(it + 1 == N) {
                System.out.println(-1);
                return;
            }
            it++;
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a + 2 * b);
            min = pq.peek();
        }

        System.out.println(it);
        return;
    }

}
