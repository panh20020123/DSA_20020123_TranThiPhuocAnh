public class SherlockArray {
/*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static String balancedSums(List<Integer> arr) {
        int n = arr.size();
        int[] a = new int[n];

        a[0] = arr.get(0);

        for (int i = 1; i < n; i++) {
            a[i] = a[i-1] + arr.get(i);
        }
        if ((a[n-1] - a[0]) == 0 || (a[n-2] == 0)) return "YES";

        for (int i = 1; i < n-1; i++) {
            if (a[i-1] == (a[n-1] - a[i])) return "YES";
        }
        return "NO";
    }

}
