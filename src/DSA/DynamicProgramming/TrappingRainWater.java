package DSA.DynamicProgramming;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;

        int [] Leftmax = new int[n];
        Leftmax[0] = height[0];

        for (int i = 1; i < n; i++) {
            Leftmax[i] = Math.max(height[i], Leftmax[i-1]);
        }

        int [] Rightmax = new int[n];
        Rightmax[n-1] = height[n-1];

        for (int i = n-2; i >= 0; i--) {
            Rightmax[i] = Math.max(height[i], Rightmax[i+1]);
        }

        int trapWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(Leftmax[i], Rightmax[i]);
            trapWater += waterLevel - height[i];
        }

        return trapWater;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int ans = trap(arr);
        System.out.println(ans);
    }
}
