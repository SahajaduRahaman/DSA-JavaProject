package DSA.GreadyAlgorithm;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(')');
            }
            else if (ch == '{') {
                st.push('}');
            }
            else if (ch == '[') {
                st.push(']');
            }
            else if (st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = ")()";

        System.out.println(isValid(s));
    }
}
