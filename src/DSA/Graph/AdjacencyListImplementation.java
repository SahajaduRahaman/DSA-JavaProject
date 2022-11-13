package DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacencyListImplementation {
    static List<List<Integer>> adj;

    AdjacencyListImplementation (int N) {
        adj = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge (int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public boolean ifEdgeExist(int u, int v) {
        return adj.get(u).contains(v);
    }

    public void deleteEdge(Integer u, Integer v) {
        adj.get(u).remove(v);
        adj.get(v).remove(u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        AdjacencyListImplementation adjBuild = new AdjacencyListImplementation(N);

        for (int i = 0; i < M; i++) {
            adjBuild.addEdge(sc.nextInt(), sc.nextInt());
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        // print graph.
        for (int i = 0; i < adj.size(); i++) {
            System.out.println(i + " - " + adj.get(i) + " ");
        }
        System.out.println();

        // check if edge exists or not and print.
        boolean c = adjBuild.ifEdgeExist(a, b);
        System.out.println(c);

        // delete edge from graph and print.
        adjBuild.deleteEdge(2, 5);
        for (int i = 0; i < adj.size(); i++) {
            System.out.println(i + " - " + adj.get(i) + " ");
        }
        System.out.println();
    }
}
