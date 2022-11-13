package DSA.Array;

import java.util.Arrays;

public class FindMissingPositive {
    private static int findMissingPos(int [] arr) {
        if (arr.length == 0) {
            return -1;
        }
        Arrays.sort(arr);
        int min = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                min ++;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {3, 4, -1, 1};

        int ans = findMissingPos(arr);

        System.out.println(ans);
    }
}
