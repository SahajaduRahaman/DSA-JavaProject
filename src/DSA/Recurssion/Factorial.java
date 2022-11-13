package DSA.Recurssion;

import java.util.Scanner;

public class Factorial {
    public static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * printFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = printFactorial(n);
        System.out.println(ans);
    }
}
