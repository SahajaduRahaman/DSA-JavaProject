package DSA.Recurssion;

import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String str, int s, int e) {

        if (s > e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return isPalindrome(str, s+1, e-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s = 0;
        int e = str.length()-1;

        boolean ans = isPalindrome(str, s, e);
        System.out.println(ans);
    }
}
