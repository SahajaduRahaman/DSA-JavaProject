package DSA.Array;

public class RemoveDuplicateFromArray {
    public static int [] removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int i = 0;
        int j = 1;

        while (i < nums.length && j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            }
            else {
                nums[++i] = nums[j];
            }
        }
        i++;
        while (i < nums.length) {
            nums[i++] = 0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 3, 3, 4};

        removeDuplicates(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
