package DSA.Recurssion;

import java.util.Scanner;

public class MultiplicationUsingAdding {
    public static int printMultiplication(int n, int m) {
        if (m == 0) {
            return 0;
        }
        return n + printMultiplication (n, m-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = printMultiplication(n, m);
        System.out.println(ans);
    }
}
