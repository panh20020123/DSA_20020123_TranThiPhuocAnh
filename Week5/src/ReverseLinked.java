import java.util.Scanner;

public class  ReverseLinked {
    public static Node head = null;
    //public static Node head1 = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            head = null;
            //head1 = null;
            for (int j =0; j < x; j++) {
                int y = sc.nextInt();
                insertNodeAtTail(y);
            }
            head = ReverseLinkedList(head);
            print(head);
        }

    }

    private static Node ReverseLinkedList(Node head) {
        Node prev = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
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

//    public static void addFirst(int data) {
//        head1 = new Node(data, head1);
//    }

    public static void print(Node head) {
        if(head == null) return;
        Node d = head;
        while(d != null) {
            System.out.print(d.data + " ");
            d = d.next;
        }
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
