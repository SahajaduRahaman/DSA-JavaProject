package DSA.Graph;

import java.util.*;

public class BfsTravarsal {
    static Map<Object, HashSet<Object>> graph;
    BfsTravarsal() {
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

    public void bfsTravarsal(Object start) {
        Set<Object> visited = new HashSet<>();
        Queue<Object> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Object current = queue.poll();
            System.out.print(current + " ");

            HashSet<Object> neighbours = graph.get(current);

            for (Object eachNeighbours : neighbours) {
                if (!visited.contains(eachNeighbours)) {
                    queue.add(eachNeighbours);
                    visited.add(eachNeighbours);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edge = sc.nextInt();

        BfsTravarsal bfs = new BfsTravarsal();
        for (int i = 0; i < edge; i++) {
            bfs.addEdge(sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i <= graph.size(); i++) {
            System.out.println(i + " " + graph.get(i));
        }
        System.out.println();

        bfs.bfsTravarsal(4);
    }
}
