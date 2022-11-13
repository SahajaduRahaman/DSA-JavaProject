package DSA.Recurssion;

import java.util.Scanner;

public class PowerValueRecursion {
    public static int printPowerValue(int x, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return x * printPowerValue(x, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(printPowerValue(x, n));
    }
}
