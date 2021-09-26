import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {

        /*
         * Complete the 'closestNumbers' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */
        public static List<Integer> closestNumbers(List<Integer> arr) {
            int n = arr.size();
            int s = 999;

            arr.sort((o1, o2) -> o1 - o2);

            List<Integer> l = new ArrayList<Integer>();

            for (int i = 1; i < n; i++) {
                s = Math.min(s, Math.abs(arr.get(i) - arr.get(i-1)));
            }
            for (int i = 1; i < n; i++) {
                int k = Math.abs(arr.get(i) - arr.get(i-1));
                if (k == s) {
                    l.add(arr.get(i - 1));
                    l.add(arr.get(i));
                }
            }
            return l;
        }
}
