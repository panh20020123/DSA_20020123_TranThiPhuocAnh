import java.util.*;

public class MissingNumSort {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        for(Integer i : arr) {
            brr.remove(i);
        }
        Insertion(brr);
        return brr;
    }

    public static void Insertion(List<Integer> a) {
        int N = a.size();

        for (int i = 0; i < N; i++)
            for (int j = i; j > 0; j--) {

                if (a.get(j-1) > a.get(j)) {
                    int swap = a.get(j-1);
                    a.set(j-1, a.get(j));
                    a.set(j, swap);
                }

                else break;
            }
    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(45678);
        x.add(33);

        //sort(x);

        for(Integer i : x) {
            System.out.println(i);
        }
    }
}
