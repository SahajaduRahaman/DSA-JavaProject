package DSA.DynamicProgramming;

public class HouseRobber {
    public static int maxMoney(int [] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int sum1 = nums[0];
        int sum2 = Math.max(nums[0], nums[1]);
        int ans = sum2;

        for (int i = 2; i < n; i++) {
            ans = Math.max(sum2, sum1 + nums[i]);
            sum1 = sum2;
            sum2 = ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 3, 4, 5, 4};

        int ans = maxMoney(arr);

        System.out.println(ans);
    }
}
