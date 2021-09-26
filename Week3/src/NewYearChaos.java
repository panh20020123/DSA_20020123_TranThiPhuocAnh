import java.util.List;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        int n = q.size();
        int k =0;
        for (int i = n-1; i >= 0; i--) {
            int m = i;
            while (q.get(m) != i+1) {
                m--;
            }
            if (i - m > 2) {
                System.out.println("Too chaotic");
                return;
            }
            while (q.get(m) != q.get(i)) {
                int x = q.get(m);
                q.set(m, q.get(m+1));
                q.set(m+1, x);
                m++;
                k++;
            }
        }
        System.out.println(k);
        return;
    }

}
