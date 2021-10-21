import java.util.ArrayList;
import java.util.List;

public class InsertionHackerrank {
    //B1
    public static void print(int n, List<Integer> arr) {
        for (int k = 0; k < n; k++) {
            System.out.print(arr.get(k) + " ");
        }
        System.out.println();
    }
    public static void insertionSort1(int n, List<Integer> arr) {

        while (true) {
            int dung = 0;
            int s = arr.get(n-1);
            for (int j = n-2; j >=0; j--) {
                if(arr.get(j) > s) {
                    int m = arr.get(j);
                    arr.set(j+1, m);
                    print(n, arr);
                }
                else {
                    arr.set(j+1, s);
                    print(n, arr);
                    dung = 1;
                    break;
                }
                if(j == 0 && dung == 0) {
                    arr.set(0, s);
                    print(n, arr);
                }

            }

            //ktra da sort chua
            int i;
            for (i = 0; i<n-1; i++)
            {
                if(arr.get(i) > arr.get(i+1)) break;
            }
            if(i == n-1) break;
        }


    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(2);arr.add(4); arr.add(6); arr.add(8); arr.add(3); arr.add(1);
        for (int k = 0; k < 6; k++) {
            System.out.print(arr.get(k) + " ");
        }
        System.out.println();
        insertionSort1(6, arr);

    }
}
