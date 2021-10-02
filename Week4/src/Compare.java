import java.util.Scanner;

public class  Compare {
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
            System.out.println(compare(head, head1));
        }

    }

    private static int compare(Node head, Node head1) {
        if(head == null && head1 == null) return 1;
        while (head != null && head1 != null) {
            if(head.data != head1.data) return 0;
            head = head.next;
            head1 = head1.next;
        }
        if(head == null && head1 == null) return 1;
        return 0;
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
