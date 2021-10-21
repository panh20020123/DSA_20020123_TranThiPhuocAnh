import java.util.ArrayList;
import java.util.List;

public class InsertionHackerrang2 {
    //B2
    public static void print(int n, List<Integer> arr) {
        for (int k = 0; k < n; k++) {
            System.out.print(arr.get(k) + " ");
        }
        System.out.println();
    }
    public static void exch(List<Integer> arr,int i,int j) {
        int ex = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, ex);
    }
    public static void insertionSort1(int n, List<Integer> arr) {

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                //if (a[j-1] > a[j]) exch(a, j, j-1);
                if (arr.get(j - 1) > arr.get(j)) exch(arr, j, j - 1);
                else break;
            }
            print(n, arr);
        }


    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);arr.add(4); arr.add(3); arr.add(5); arr.add(6); arr.add(2);
//        for (int k = 0; k < 6; k++) {
//            System.out.print(arr.get(k) + " ");
//        }
        System.out.println();
        insertionSort1(6, arr);

    }
}