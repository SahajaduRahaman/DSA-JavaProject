package DSA.Searching;

public class SearchInSortedRotatedArray {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                ans = mid;
                break;
            }
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int ans = search(arr, target);
        System.out.println(ans);
    }
}
