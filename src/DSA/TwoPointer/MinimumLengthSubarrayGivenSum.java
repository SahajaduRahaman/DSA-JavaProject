package DSA.TwoPointer;

import java.util.Scanner;

public class MinimumLengthSubarrayGivenSum {
    public static int minSubArrayLen(long target, int[] arr) {
        if (arr.length == 0 || target <= 0)
            return 0;

        int i = 0, j = 0, min = Integer.MAX_VALUE;
        long sum = 0;

        while (j < arr.length) {
            sum += arr[j++];

            while (sum >= target) {
                min = Math.min(min, j - i);
                sum -= arr[i++];
            }
        }

        return min;
    }
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int  n = sc.nextInt();
        long target = sc.nextLong();

        int [] arr = new int[n];

        for (int i  = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = minSubArrayLen(target, arr);
        System.out.println(ans);
    }
}
