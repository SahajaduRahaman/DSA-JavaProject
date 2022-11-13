package DSA.Searching;

public class FindFirstAndLastIndex {
    public static int [] findFirstAndLastIndex(int [] nums, int target) {
        int low = 0, high = nums.length - 1, ans1 = -1;

        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) {
                ans1 = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        low = 0; high = nums.length-1; int ans2 = -1;

        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) {
                ans2 = mid;
                low = mid+1;
            }
            else if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return new int[]{ans1, ans2};
    }
    public static void main(String[] args) {
        int [] arr = {5, 7, 7, 8, 8, 8, 8, 10};
        int target = 8;

        int [] res = findFirstAndLastIndex(arr, target);

        for (int result : res) {
            System.out.print(result + " ");
        }
    }
}
