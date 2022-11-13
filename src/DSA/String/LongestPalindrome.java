package DSA.String;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                len += 2;
                set.remove(c);
            }
            else set.add(c);
        }

        return set.size() > 0 ? len + 1 : len;
    }
    public static void main(String[] args) {
        String s = "abccccdd";

        int ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
