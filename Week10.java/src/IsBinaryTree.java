public class IsBinaryTree {
    boolean checkBST(Node root) {

        return( isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    boolean isBST2(Node node, int min, int max) {
        if (node == null)
            return true;

        if (node.data < min || node.data > max)
            return false;

        return (isBST2(node.left, min, node.data-1) &&
                isBST2(node.right, node.data+1, max));
    }
}
