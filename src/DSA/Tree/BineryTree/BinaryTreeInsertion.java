package DSA.Tree.BineryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeInsertion {
    static Node root = null;
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }
    public void insertNode (int data) {
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

    public void inOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inOrderPrint(root.left);
        inOrderPrint(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        BinaryTreeInsertion btInsert = new BinaryTreeInsertion();

        for (int i = 0; i < N; i++) {
            btInsert.insertNode(sc.nextInt());
        }

        btInsert.inOrderPrint(root);
    }
}
