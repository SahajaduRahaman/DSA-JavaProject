package DSA.Tree.BineryTree.View;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {
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
    public void printRightView(Node root) {
        ArrayList<Node> list = new ArrayList<>();

        rightViewHelper(root, list, 0);

        for (Node eachNode : list) {
            System.out.print(eachNode.data + " ");
        }
        System.out.println();
    }

    public void rightViewHelper(Node root, ArrayList<Node> list, int level) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(root);
        }
        rightViewHelper(root.right, list, level + 1);
        rightViewHelper(root.left, list, level + 1);
    }

    public static void main(String[] args) {
        int N = 15;
        RightView btRightView = new RightView();

        for (int i = 1; i < N; i++) {
            btRightView.insertNode(i);
        }

        btRightView.printRightView(btRightView.root);
    }
}
