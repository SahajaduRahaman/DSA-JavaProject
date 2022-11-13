package DSA.String;

import java.util.Arrays;

public class StringAnagram {
    public static boolean getAnagram(String str, String trs) {
        if (str.length() != trs.length()) {
            return false;
        }

        char [] sArray = str.toCharArray();
        char [] tArray = trs.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String str = "anagram";
        String trs = "nagaram";

        System.out.println(getAnagram(str, trs));
    }
}
