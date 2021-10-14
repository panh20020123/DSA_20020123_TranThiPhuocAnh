import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    static String s = "";
    static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            switch (q){
                case 1:
                    String w = sc.next();
                    append(w);
                    break;
                case 2:
                    int k = sc.nextInt();
                    delete(k);
                    break;
                case 3:
                    int kth = sc.nextInt();
                    print(kth);
                    break;
                case 4:
                    Undo();
                    break;
            }
           // System.out.println(s);

        }
    }

    private static void Undo() {
        stack.pop();
        s = stack.peek();
    }

    public static void print(int kth) {

        System.out.println(s.charAt(kth - 1));
    }

    public static void delete(int k) {
        int l = s.length();
        if (l < k) return;
        s = s.substring(0, l - k);
        stack.push(s);
    }

    public static void append(String w) {
        s = s + w;
        stack.push(s);
    }
}
