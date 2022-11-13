package DSA.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class GraphUsingMapAndSet {
    static Map<Object, HashSet<Object>> graph;

    GraphUsingMapAndSet () {
        graph = new HashMap<>();
    }

    public void addEdge(Object u, Object v) {
        if (!graph.containsKey(u)) {
            graph.put(u, new HashSet<>());
        }
        if (!graph.containsKey(v)) {
            graph.put(v, new HashSet<>());
        }
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void deleteEdge(Object u, Object v) {
        if (graph.containsKey(u)) {
            if (graph.get(u).contains(v)) {
                graph.get(u).remove(v);
            }
        }
        if (graph.containsKey(v)) {
            if (graph.get(v).contains(u)) {
                graph.get(v).remove(u);
            }
        }
    }

    public boolean ifEdgeExist(Object u, Object v) {
        if (graph.containsKey(u)) {
            if (graph.get(u).contains(v)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();

        GraphUsingMapAndSet graphMap = new GraphUsingMapAndSet();

        for (int i = 0; i < E; i++) {
            graphMap.addEdge(sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i <= graph.size(); i++) {
            System.out.println(i + " :- " + graph.get(i) + " ");
        }
        System.out.println();

        graphMap.deleteEdge(sc.nextInt(), sc.nextInt());
        for (int i = 0; i <= graph.size(); i++) {
            System.out.println(i + " :- " + graph.get(i) + " ");
        }
        System.out.println();

        boolean b = graphMap.ifEdgeExist(sc.nextInt(), sc.nextInt());
        System.out.println(b);
    }
}
