import java.util.*;

public class MissingNumHash {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        List<Integer> out = new ArrayList<>();

        Map<Integer, Integer> count = new HashMap<>();
        for(Integer i : arr) {
            if (!count.containsKey(i)) {
                count.put(i, 1);
            } else {
                int x = count.get(i);
                count.put(i, x + 1);
            }
        }

        for (Integer i : brr) {
            if(count.containsKey(i)) {
                int x = count.get(i);

                if(x == 1) count.remove(i);
                    else count.put(i, x - 1);
            } else {
                out.add(i);
            }
        }
        sort(out);
        return out;
    }

    public static void sort(List<Integer> a)
    {
        int n = a.size();
        for (int i = 0; i < n; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (a.get(j) < a.get(min)){
                    min = j;
                }
            int swap = a.get(i);
            a.set(i, a.get(min));
            a.set(min, swap);
        }
    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(45678);
        x.add(33);

        sort(x);

        for(Integer i : x) {
            System.out.println(i);
        }
    }
}
