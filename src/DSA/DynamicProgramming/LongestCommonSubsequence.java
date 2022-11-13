package DSA.DynamicProgramming;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String strA, String strB) {
        char[] str1 = strA.toCharArray();
        char[] str2 = strB.toCharArray();

        int [][] temp = new int[str1.length + 1][str2.length + 1];
        int max = 0;

        for(int i=1; i < temp.length; i++) {
            for(int j=1; j< temp[i].length; j++) {

                if(str1[i-1] == str2[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                }

                else {
                    temp[i][j]=Math.max(temp[i][j-1], temp[i-1][j]);
                }

                if(temp[i][j] > max) {
                    max = temp[i][j];
                }

            }
        }

        return max;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String t = "ace";

        int ans = longestCommonSubsequence(s, t);
        System.out.println(ans);
    }
}
