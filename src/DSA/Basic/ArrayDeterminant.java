package DSA.Basic;

import java.util.Scanner;

public class ArrayDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] Arr = new int[2][2];
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                Arr [i][j] = sc.nextInt();
            }
        }
        int d = (Arr[0][0]*Arr[1][1])-(Arr[0][1]*Arr[1][0]);
        System.out.println(d);
    }
}
