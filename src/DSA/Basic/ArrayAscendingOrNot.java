package DSA.Basic;

import java.util.Scanner;

public class ArrayAscendingOrNot {
    public static void isAscending(int[] Arr ) {
        boolean isAscending= true;
        for (int i=0; i<Arr.length-1; i++) {
            if (Arr[i] > Arr[i + 1]) {
                isAscending=false;
                break;
            }
        }
        if (isAscending) {
            System.out.println("This Array is an ascending order");
        }
        else {
            System.out.println("This Array is not an ascending order");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Arr = new int[n];
        for (int i=0; i<n; i++) {
            Arr [i] = sc.nextInt();
        }
        isAscending(Arr);
    }
}
