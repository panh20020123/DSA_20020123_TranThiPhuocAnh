public class SelfBalancingTree {
    /* Class node is defined as :
     class Node
        int val;   //Value
        int ht;      //Height
        Node left;   //Left child
        Node right;   //Right child

    */
    static Nodee insert(Nodee root,int val) {
        if (root == null){
            Nodee n = new Nodee();
            n.val = val;
            n.ht = 0;
            return n;
        }

        Nodee n;

        if(val > root.val){
            n = insert(root.right,val);
            root.right = n;
        }else{
            n = insert(root.left,val);
            root.left = n;
        }

        if(root.ht==n.ht)
            root.ht++;

        root = balance(root);

        return root;
    }

    static Nodee balance(Nodee root){
        int htLeft = (root.left==null)?0:root.left.ht+1;
        int htRight = (root.right==null)?0:root.right.ht+1;
        if(htLeft-htRight<-1){
            //rotate left
            Nodee child = root.right;
            int childBF = ((child.left==null)?0:child.left.ht+1) - ((child.right==null)?0:child.right.ht+1);
            if (childBF > 0){
                Nodee newChildRoot = child.left;
                Nodee tmp = newChildRoot.right;
                newChildRoot.right = child;
                child.left = tmp;
                root.right = newChildRoot;
                int tmpH = child.ht;
                child.ht=newChildRoot.ht;
                newChildRoot.ht = tmpH;
            }
            Nodee newRoot = root.right;
            Nodee tmp = newRoot.left;
            newRoot.left = root;
            root.right = tmp;
            int tmpH = root.ht;
            root.ht=newRoot.ht-1;
            newRoot.ht = tmpH-1;
            root = newRoot;
        } else if(htLeft-htRight>1){
            //rotate right
            Nodee child = root.left;
            int childBF = ((child.left==null)?0:child.left.ht+1) - ((child.right==null)?0:child.right.ht+1);
            if (childBF < 0){
                Nodee newChildRoot = child.right;
                Nodee tmp = newChildRoot.left;
                newChildRoot.left = child;
                child.right = tmp;
                root.left = newChildRoot;
                int tmpH = child.ht;
                child.ht=newChildRoot.ht;
                newChildRoot.ht = tmpH;
            }
            Nodee newRoot = root.left;
            Nodee tmp = newRoot.right;
            newRoot.right = root;
            root.left = tmp;
            int tmpH = root.ht;
            root.ht=newRoot.ht-1;
            newRoot.ht = tmpH-1;
            root = newRoot;
        }

        return root;
    }
}
