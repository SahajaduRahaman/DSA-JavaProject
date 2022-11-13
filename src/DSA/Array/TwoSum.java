package DSA.Array;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                ans[0] = hm.get(target - nums[i]);
                ans[1] = i;
                break;
            }
            else {
                hm.put(nums[i], i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;

        int [] ans = twoSum(arr, target);
        for (int an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
}
