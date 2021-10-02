import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Merge {
    public static Node head = null;
    public static Node head1 = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = null;
            head1 = null;

            int x = sc.nextInt();
            for (int j =0; j < x; j++) {
                int x1 = sc.nextInt();
                head = insertNodeAtTail(x1, head);
            }
            int y = sc.nextInt();
            for (int j =0; j < y; j++) {
                int y1 = sc.nextInt();
                head1 = insertNodeAtTail(y1, head1);
            }
            Node k = merge(head, head1);
            print(k);
            System.out.println();
        }

    }

    // 1 3 7
    // 1 2
    // 1 2 3 7
    private static Node merge(Node h, Node h1) {
        List<Integer> a = new ArrayList<Integer>();

        while (h != null) {
            a.add(h.data);
            h = h.next;
        }
        while (h1 != null) {
            a.add(h1.data);
            h1 = h1.next;
        }

        a.sort( (o1, o2) -> o2-o1 );
        Node d = new Node(a.get(0), null);

        for(int i = 1; i < a.size(); i++) {
             d = new Node(a.get(i), d);
        }
        return d;
    }

    public static void print(Node d) {
        while(d != null) {
            System.out.print(d.data + " ");
            d = d.next;
        }
    }

    private static Node insertNodeAtTail(int data, Node h) {
        if (h == null) return new Node(data, null);

        Node d = h;
        while(d.next != null) {
            d = d.next;
        }
        d.next = new Node(data, null);
        return h;
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
