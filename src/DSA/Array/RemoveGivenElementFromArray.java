package DSA.Array;

public class RemoveGivenElementFromArray {
    public static int [] removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k ++;
            }
        }
        while (k < nums.length) {
            nums[k++] = 0;
        }

        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        removeElement(arr, val);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
