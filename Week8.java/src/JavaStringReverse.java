import java.util.Scanner;

public class JavaStringReverse {
    //m a d a m
    //0 1 2 3 4
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        int n = A.length();

        for(int i = 0; i < n; i++) {
           if (A.charAt(i) != A.charAt(n-i-1)) {
               System.out.println("No");
               return;
           }
        }
        System.out.println("Yes");
        //System.out.println(RA);
    }
}
