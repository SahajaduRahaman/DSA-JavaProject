package DSA.Pattern;

public class NumberIncreasingPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int x = i * 6;
            for (int j = 1; j <= n; j++) {
                System.out.print(x + " ");
                x += 4;
            }
            System.out.println();
        }
    }
}
