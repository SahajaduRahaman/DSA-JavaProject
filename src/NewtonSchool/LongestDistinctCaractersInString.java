package NewtonSchool;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestDistinctCaractersInString {
    public static int max(String s) {
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;
        while(right < s.length() && left < s.length()){
            Character c = s.charAt(right);
            if (set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }else {
                set.add(c);
                int length = right - left + 1;
                right++;
                max = Math.max(max,length);
            }
        }
        return max;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            // System.out.println(max("s"));
            int ans = max(s);
            System.out.println(ans);
        }
    }
}
