package DSA.Tree.BinerySearchTree;

public class isBinarySearchTree {
    Node root = null;
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isBSTHelper (int min, int max, Node root){
        if (root == null) {
            return true;
        }
        if (min >= root.data || max <= root.data) {
            return false;
        }
        boolean left = isBSTHelper(min, root.data, root.left);
        boolean right = isBSTHelper(root.data, max, root.right);

        return left && right;
    }

    public boolean isBST(Node root) {
        return isBSTHelper(Integer.MIN_VALUE, Integer.MAX_VALUE, root);
    }

    public static void main(String[] args) {
        isBinarySearchTree bst = new isBinarySearchTree();
        bst.root = new Node(6);
        bst.root.left = new Node(3);
        bst.root.right = new Node(9);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(4);

        boolean b = bst.isBST(bst.root);
        System.out.println(b);
    }
}
