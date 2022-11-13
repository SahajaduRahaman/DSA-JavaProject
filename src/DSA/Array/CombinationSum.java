package DSA.Array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void combinationSumHelper(int [] arr, int target, int indx, List<List<Integer>> result, List<Integer> list) {
        if ( target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (indx >= arr.length) {
            return;
        }
        if (arr[indx] <= target) {
            list.add(arr[indx]);
            combinationSumHelper(arr, target - arr[indx], indx, result, list);
            list.remove(list.size() - 1);
        }
        combinationSumHelper(arr, target, indx + 1, result, list);
    }
    public static List<List<Integer>> getCombinationSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        combinationSumHelper(arr, target, 0, result, new ArrayList<>());
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = getCombinationSum(arr, target);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
