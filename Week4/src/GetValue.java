import java.util.Scanner;

public class  GetValue {
    public static Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = null;

            int x = sc.nextInt();
            for (int j =0; j < x; j++) {
                int x1 = sc.nextInt();
                head = insertNodeAtTail(x1, head);
            }
            int k = sc.nextInt();
            System.out.println(getValue(k , head));
            //print(head);
        }

    }
    public static void print(Node head) {
        if(head == null) return;
        Node d = head;
        while(d != null) {
            System.out.print(d.data + " ");
            d = d.next;
        }
    }
    private static int getValue(int p,  Node h) {
        int j = 0;
        while (h != null) {
            if(j == p) return h.data;
            j++;
            h = h.next;
        }
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
