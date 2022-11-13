package DSA.Basic;

import java.util.Scanner;

public class CircumferenceOfCiecle {
    public static void circumference(int M) {
        double N = (2 * 3.14159 * M);
        System.out.println(N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        circumference(M);
    }
}
