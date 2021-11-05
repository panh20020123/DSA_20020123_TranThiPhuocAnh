import java.util.*;
        import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TreeInorderTraversal {
    public static void inOrder(Node root) {
        if(root.left != null) inOrder(root.left);
        System.out.print(root.data + " ");
        if(root.right != null) inOrder(root.right);
    }

    public static void preOrder(Node root) {
        System.out.print(root.data + " ");
        if(root.left != null) preOrder(root.left);
        if(root.right != null) preOrder(root.right);
    }

    //
    static Queue<Node> q = new LinkedList<>();

    public static void levelOrder(Node root) {
        Node last = root;
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);
        Node cur = null;
        while (!q1.isEmpty() || !q2.isEmpty()) {
            while (!q1.isEmpty()) {
                cur = q1.poll();
                if (cur.left != null) {
                    q2.add(cur.left);
                }
                if (cur.right != null) {
                    q2.add(cur.right);
                }
                System.out.print(cur.data + " ");
            }
            while (!q2.isEmpty()) {
                cur = q2.poll();
                if (cur.left != null) {
                    q1.add(cur.left);
                }
                if (cur.right != null) {
                    q1.add(cur.right);
                }
                System.out.print(cur.data + " ");
            }
        }

    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();

        //inOrder(root);
        //preOrder(root);
        levelOrder(root);

    }
}