import java.util.Scanner;

public class InsertTail {
    public static Node head = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            insertNodeAtTail(x);
        }
        print(head);
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
        Node d = head;
        while(d != null) {
            System.out.println(d.data);
            d = d.next;
        }
        return;
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
