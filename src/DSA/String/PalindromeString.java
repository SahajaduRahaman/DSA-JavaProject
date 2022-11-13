package DSA.String;

public class PalindromeString {
    public static boolean isPalindrome(String str, int start, int end) {
        if (str.length() == 1) {
            return true;
        }
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
