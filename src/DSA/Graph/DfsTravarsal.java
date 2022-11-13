package DSA.Graph;

import java.util.*;

public class DfsTravarsal {
    static HashMap<Object, HashSet<Object>> graph;
    DfsTravarsal () {
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

    public void dfsTravarsal (Object start) {
        Set<Object> Visited = new HashSet<>();
        Stack<Object> stack = new Stack<>();

        stack.add(start);

        while (!stack.isEmpty()) {

            Object current = stack.pop();

            if (!Visited.contains(current)) {
                System.out.print(current + " ");
                Visited.add(current);
            }

            HashSet<Object> neighbours = graph.get(current);

            for (Object eachNeighbours : neighbours) {
                if (!Visited.contains(eachNeighbours)) {
                    stack.add(eachNeighbours);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Edge = sc.nextInt();

        DfsTravarsal dfs = new DfsTravarsal();
        for (int i = 0; i < Edge; i++) {
            dfs.addEdge(sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i <= graph.size(); i++) {
            System.out.println(i + " " + graph.get(i));
        }

        dfs.dfsTravarsal(3);
    }
}
