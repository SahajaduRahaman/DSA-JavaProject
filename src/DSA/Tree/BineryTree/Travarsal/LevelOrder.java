package DSA.Tree.BineryTree.Travarsal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder {
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
    private static void levelOrder(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node temp = que.poll();

            System.out.print(temp.data + " ");

            if (temp.left != null) {
                que.add(temp.left);
            }
            if (temp.right != null) {
                que.add(temp.right);
            }
        }
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

        levelOrder((list.get(0)));
    }
}
