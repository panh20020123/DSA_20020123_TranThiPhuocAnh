import java.util.Scanner;

public class PrintLinkedList {
    public static Node head = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            addFirst(x);
        }
        print(head);
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
