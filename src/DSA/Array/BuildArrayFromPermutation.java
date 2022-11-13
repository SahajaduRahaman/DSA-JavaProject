package DSA.Array;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {0,2,1,5,3,4};
        int [] res = buildArray(arr);

        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
