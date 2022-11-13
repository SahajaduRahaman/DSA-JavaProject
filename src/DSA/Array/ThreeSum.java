package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[j++]);
                    list.add(arr[k--]);

                    result.add(list);
                }
                else if (sum > 0) {
                    k --;
                }
                else {
                    j ++;
                }
            }
        }

        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        int [] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(arr);

        for (List<Integer> an : ans) {
            System.out.print(an);
        }
    }
}
