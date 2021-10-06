import java.util.Scanner;

public class DeleteNode {
    public static Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            insertNodeAtTail(x);
        }
        int p = sc.nextInt();
        DeleteN(p);
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

    public static void DeleteN(int k) {
        Node d = head;
        if (k == 0) {head = head.next; return;}
        while (k != 1) {
            d = d.next;
            k--;
        }
        d.next = d.next.next;
    }

    public static void addFirst(int data) {
        head = new Node(data, head);
    }
    public static void print(Node head) {
        if(head == null) return;
        Node d = head;
        while(d != null) {
            System.out.print(d.data + " ");
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
