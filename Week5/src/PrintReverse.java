import java.util.Scanner;

public class PrintReverse {
    public static Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            head = null;
            for (int j =0; j < x; j++) {
                int y = sc.nextInt();
                insertNodeAtTail(y);
            }
            print(head);
        }

    }

    private static void insertNodeAtTail(int data) {
        if (head == null) head = new Node(data, null);
        else {
            Node d = head;
            while(d.next != null) {
                d = d.next;
            }
            d.next = new Node(data, null);
        }
    }

    public static void addFirst(int data) {
        head = new Node(data, head);
    }

    public static void print(Node head) {
        if(head == null) return;
        print(head.next);
        System.out.println(head.data);
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
