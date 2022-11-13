package DSA.String;

public class ReverseStringUsingRecursion {
    private static void reverseString(String str) {

        if ((str == null) || (str.length() <= 1)) {
            System.out.println(str);
        }

        else {
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }

    }
    public static void main(String[] args) {
        String str = "anagram";

        reverseString(str);
    }
}
