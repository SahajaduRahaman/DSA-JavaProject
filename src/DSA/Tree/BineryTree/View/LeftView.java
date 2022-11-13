package DSA.Tree.BineryTree.View;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    Node root = null;
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insertNode(int data) {
        Node curr = new Node(data);
        if (root == null) {
            root = curr;
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        Node temp;
        while (!que.isEmpty()) {
            temp = que.poll();

            if (temp.left == null) {
                temp.left = curr;
                break;
            }
            else {
                que.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = curr;
                break;
            }
            else {
                que.add(temp.right);
            }
        }
    }

    public void printLeftView(Node root) {
        ArrayList<Node> list = new ArrayList<>();

        printLeftHelper(root, list, 0);

        for (Node eachNode : list) {
            System.out.print(eachNode.data + " ");
        }
        System.out.println();
    }

    public void printLeftHelper(Node root, ArrayList<Node> list, int level) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(root);
        }
        printLeftHelper(root.left, list, level + 1);
        printLeftHelper(root.right, list, level + 1);
    }

    public static void main(String[] args) {
        int n = 15;
        LeftView btLeftView = new LeftView();

        for (int i = 1; i < n; i++) {
            btLeftView.insertNode(i);
        }

        btLeftView.printLeftView(btLeftView.root);
    }
}
