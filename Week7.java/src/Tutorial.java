import edu.princeton.cs.algs4.Insertion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutorial {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2); a.add(3);a.add(4);a.add(5);a.add(6);a.add(7);
        System.out.println(introTutorial(0, a));
    }

    public static int introTutorial(int V, List<Integer> arr) {
        int dau = 0, cuoi = arr.size();
        while (dau <= cuoi) {
            int giua = (dau + cuoi)/2;
            if (arr.get(giua) == V) return giua;
            if (arr.get(giua) > V) {cuoi = giua - 1;}
            else if (arr.get(giua) < V) {dau = giua + 1;}
        }

        return -1;
    }

}
