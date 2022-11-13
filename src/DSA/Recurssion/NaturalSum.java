package DSA.Recurssion;

import java.util.Scanner;

public class NaturalSum {
    public static int printNaturalSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printNaturalSum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = printNaturalSum(n);
        System.out.println(ans);
    }
}
