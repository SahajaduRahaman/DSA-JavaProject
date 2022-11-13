package DSA.GreadyAlgorithm;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            }
            else {
                st.pop();

                if (st.size() == 0) {
                    st.push(i);
                }
                else {
                    ans = Math.max(ans, i - st.peek());
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = ")()())";
        int ans = longestValidParentheses(s);

        System.out.println(ans);
    }
}
