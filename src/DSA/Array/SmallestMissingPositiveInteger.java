package DSA.Array;

import java.util.Arrays;

public class SmallestMissingPositiveInteger {
    private static int findMissingPositive(int [] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int missing = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > missing) {
                return missing;
            }
            else {
                missing += arr[i];
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 6, 10, 11, 15};
        int ans = findMissingPositive(arr);
        System.out.println(ans);
    }
}
