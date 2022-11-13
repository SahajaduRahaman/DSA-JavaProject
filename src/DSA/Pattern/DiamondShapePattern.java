package DSA.Pattern;

public class DiamondShapePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int k = i; k < n-1; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i+i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int k = i; k < n; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i+i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
