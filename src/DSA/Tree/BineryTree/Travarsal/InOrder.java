package DSA.Tree.BineryTree.Travarsal;

import java.util.ArrayList;
import java.util.Scanner;

public class InOrder {
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
    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);

        System.out.println(root.data);

        inOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Node> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            list.add(new Node(i));
        }
        for(int i = 0; i < n; i++) {
            Node current = list.get(i);
            int left = sc.nextInt();
            int right = sc.nextInt();

            current.left = left == -1 ? null : list.get(left-1);
            current.right = right == -1 ? null : list.get(right-1);
        }

        inOrder((list.get(0)));
    }
}
