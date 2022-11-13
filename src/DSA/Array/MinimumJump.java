package DSA.Array;

public class MinimumJump {
    private static int minJumps(int[] arr){

        if (arr[0] == 0) {
            return -1;
        }

        int count = 0, curEnd = 0, temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            temp = Math.max(temp, i + arr[i]);

            if (i == curEnd) {
                count++;
                curEnd = temp;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {2, 1, 1, 1, 1};

        int ans = minJumps(arr);
        System.out.println(ans);
    }
}
