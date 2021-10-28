import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> count = new ArrayList<>();;
        count.add(0, 1);
        count.add(1, 3);
        count.add(3, 4);
        System.out.println(count.get(2));
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> count = new ArrayList<>();
        int n = arr.size();
        for(int i = 0; i < 100; i++){
            count.add(i, 0);
        }
        for(int i = 0; i < n; i++){
            int j = arr.get(i);
            int s = count.get(j);
            count.set(j, s+1);
        }
        return count;
    }

}
