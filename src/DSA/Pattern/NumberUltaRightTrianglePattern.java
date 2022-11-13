package DSA.Pattern;

public class NumberUltaRightTrianglePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int k = i; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
