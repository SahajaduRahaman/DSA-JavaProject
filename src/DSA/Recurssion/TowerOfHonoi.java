package DSA.Recurssion;

import java.util.Scanner;

public class TowerOfHonoi {
    public static void printTowerOfHonoi(int n, String A, String B, String C) {
        if (n == 1) {
            System.out.println("Disk :-" +n+ " From > " +A+ " To " +C);
            return;
        }
        printTowerOfHonoi(n-1, A, C, B);
        System.out.println("Disk :-" +n+ " From > " +A+ " To " +C);
        printTowerOfHonoi(n-1, B, A, C);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTowerOfHonoi(n, "A", "B", "C");
    }
}
