import java.util.Arrays;

public class binarySearch {
    /**
     * HAM TIM KIEM NHI PHAN.
     * @param a mang
     * @param number so can tim
     * @return index so can tim
     */
    public static int BinarySearch(int[] a, int number) {
        int dau = 0;
        int cuoi = a.length - 1;
        while (dau <= cuoi) {
                int giua = (dau + cuoi)/2;
                if (a[giua] == number) {
                    return giua;
                }
                else if(a[giua] < number) dau = giua+1;
                else if(a[giua] > number) cuoi = giua-1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        Arrays.sort(a);
    }
}
