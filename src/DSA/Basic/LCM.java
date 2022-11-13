package DSA.Basic;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int J = m;
        int K = n;
        while (m % n != 0) {
            int gcd = m % n;
            m = n;
            n = gcd;
        }
        int div = n;
        int lcm = (J * K) / div;
        System.out.println(lcm);
    }
}
