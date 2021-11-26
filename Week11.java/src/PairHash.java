import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairHash {
    public static int pairs(int k, List<Integer> arr) {
        int count = 0;
        Set<Integer> a = new HashSet<>();
        for(Integer i : arr) {
            a.add(i);
        }
        for(Integer i : a) {
            if(a.contains(i + k)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(45678);
        x.add(33);

        pairs(3, x);
    }
}
