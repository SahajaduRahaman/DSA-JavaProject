package DSA.Array;

import java.util.Arrays;

public class KClosestPointsToOrigin {
    public static void printDidtance(int [][] arr, int k) {
        int n = arr.length;
        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            int x = arr[i][0], y = arr[i][1];
            distance[i] = (x * x) + (y * y);
        }

        Arrays.sort(distance);

        // Find the k-th distance
        int distk = distance[k - 1];

        // Print all distances which are
        // smaller than k-th distance
        for (int i = 0; i < n; i++) {
            int x = arr[i][0], y = arr[i][1];
            int dist = (x * x) + (y * y);

            if (dist <= distk) {
                System.out.println(x + ", " + y);
            }
        }
    }

    public static void main(String[] args) {
        int [][] arr = {{1,3},{-1,3},{5,8}};
        int k = 2;
        printDidtance(arr, k);
    }
}
