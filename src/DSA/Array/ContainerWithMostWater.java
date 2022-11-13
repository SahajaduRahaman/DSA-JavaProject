package DSA.Array;

public class ContainerWithMostWater {
    private static int getMaxArea(int [] arr) {
        int ans = 0;
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int min = Math.min(arr[start], arr[end]);
            int length = end - start;
            ans = Math.max(ans, length * min);

            int s = arr[start];
            int e = arr[end];

            if (s <= e) {
                start ++;
            }
            else {
                end --;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(getMaxArea(arr));
    }
}
