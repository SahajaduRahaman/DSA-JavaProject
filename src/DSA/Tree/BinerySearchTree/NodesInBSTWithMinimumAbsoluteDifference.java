package DSA.Tree.BinerySearchTree;

import java.util.ArrayList;
import java.util.List;

public class NodesInBSTWithMinimumAbsoluteDifference {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left=null;
            right=null;

        }
    }
    public static  int absMinDist(Node root) {
        List<Integer> list = new ArrayList<>();
        differ(root, list);
        return getAns(list);
    }
    public static void differ(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        differ(root.left, list);

        list.add(root.data);

        differ(root.right, list);
    }

    public static int getAns(List<Integer> list) {
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < list.size() - 1; i++) {
            if (res > Math.abs(list.get(i) - list.get(i + 1))) {
                res = Math.abs(list.get(i) - list.get(i + 1));
            }
        }
        return res;
    }
}
