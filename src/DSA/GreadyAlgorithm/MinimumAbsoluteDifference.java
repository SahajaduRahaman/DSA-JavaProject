package DSA.GreadyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        int absDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int currDiff = arr[i] - arr[i - 1];

            if (currDiff > absDiff) {
                continue;
            }
            if (currDiff < absDiff) {
                absDiff = currDiff;
                result.clear();
            }
            result.add(Arrays.asList(arr[i - 1], arr[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr = {4, 2, 1, 3};

        List<List<Integer>> result = minimumAbsDifference(arr);

        for (List<Integer> integers : result) {
            System.out.print(integers + " ");
        }
    }
}
