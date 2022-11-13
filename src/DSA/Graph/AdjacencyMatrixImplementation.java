package DSA.Graph;

import java.util.Scanner;

public class AdjacencyMatrixImplementation {
    static int [][] matrix;

    AdjacencyMatrixImplementation(int N) {
        matrix = new int[N + 1][N + 1];
    }

    private void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }
    public boolean ifEdgeExist(int u, int v) {
        return matrix[u][v] == 1;
    }

    public void deleteEdge(int u, int v) {
        matrix[u][v] = 0;
        matrix[v][u] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        AdjacencyMatrixImplementation mat = new AdjacencyMatrixImplementation(N);

        for (int i = 0; i < M; i++) {
            mat.addEdge(sc.nextInt(), sc.nextInt());
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        // print graph.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // check if edge exists or not and print.
        boolean c = mat.ifEdgeExist(a, b);
        System.out.println(c);

        // delete edge from graph and print.
        mat.deleteEdge(2, 5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
