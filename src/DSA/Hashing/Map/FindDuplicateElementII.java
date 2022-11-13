package DSA.Hashing.Map;

public class FindDuplicateElementII {
    public static int printDuplicateElement(int [] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];            // 1 - 2 5  - 5 - 4 5
            fast = arr[arr[fast]];       // 1 - 5 5  - 1 - 2 5
        }
        while (slow != fast);

        fast = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int [] arr = {3, 2, 4, 6, 1, 4, 5};

        int ans = printDuplicateElement(arr);

        System.out.println(ans);
    }
}
