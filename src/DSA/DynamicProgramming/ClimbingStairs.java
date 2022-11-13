package DSA.DynamicProgramming;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        int third = 0;

        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = climbStairs(n);

        System.out.println(ans);
    }
}
