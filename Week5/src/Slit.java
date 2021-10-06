public class Slit<Item> implements Mylist<Item> {
    Node head;

    public void print() {
        System.out.print("[ ");
        print(head);
        System.out.println("]");
    }

    private void print(Node start) {
        if (start == null) return;
        System.out.print(start.data + "  ");
        print(start.next);
    }

    public void addFirst(Item data) {
        head = new Node(data, head);
    }

    public void addLast(Item data) {
        head = addLast(data, head);
    }
    private Node addLast(Item data, Node start) {
        if(start != null) {
            start.next = addLast(data, start.next);
            return start;
        }
        else {
            return new Node(data, null);
        }
    }
    public void oldaddLast(Item data) {
        if (head == null) {
            head = new Node(data, null);
            return;
        }
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(data, null);
    }

    private class Node {
        Item data;
        Node next;
        public Node(Item data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
