public class Dlist<Item> implements Mylist<Item> {
        Node header;
        Node trailer;

        public Dlist() {
            header = new Node(null, null, null);
            trailer = new Node(null, header, null);
            header.next = trailer;
        }
        public void print() {
            System.out.print("[ ");
            Node current = header.next;
            while (current != trailer) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("]");
        }

       /* private void print(Node start) {
            if (start == null) return;
            System.out.print(start.data + "  ");
            print(start.next);
        }*/

        public void addFirst(Item data) {
            insertAfter(data, header);
        }

        public void addLast(Item data) {
            insertAfter(data, trailer.prev);
        }
        private void insertAfter(Item data, Node node) {
            Node newNode = new Node(data, node, node.next);
            node.next = newNode;
            newNode.next.prev = newNode;
        }
        private class Node {
            Item data;
            Node next;
            Node prev;
            public Node(Item data, Node prev, Node next) {
                this.data = data;
                this.next = next;
                this.prev = prev;
            }
        }

}
