package DSA.Basic;

import java.util.Scanner;

public class Boundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[][] Array = new int[M][N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    Array[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 0 || i == M - 1 || j == 0 || j == N - 1) {
                        System.out.print(Array[i][j] + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("  ");
            }
        }
    }
}
