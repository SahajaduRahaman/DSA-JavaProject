package DSA.Basic;

import java.util.Scanner;

public class GcdOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        while (m % n != 0) {
            int gcd = m % n;
            m = n;
            n = gcd;
        }
        System.out.println(n);
    }
}
