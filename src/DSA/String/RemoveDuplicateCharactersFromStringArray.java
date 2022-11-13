package DSA.String;

import java.util.HashSet;
import java.util.Set;
/* WAP to remove the duplicate character from array of String
   Input - {"aabscs", "abcd", "aaaa", null, "", "aaabbb", "abababa"};
   Output- {absc, abcd, a, null, , ab, ab}; */

public class RemoveDuplicateCharactersFromStringArray {
    public static void main(String[] args) {
        String[] sArray = {"aabscs", "abcd", "aaaa", null, "", "aaabbb", "abababa"};
        String[] ans = new String[sArray.length];
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < sArray.length; i++) {
            if(sArray[i] == null || sArray[i] == "") {
                sb.append(sArray[i]);
            }
            else {
                for (char value : sArray[i].toCharArray()) {
                    set.add(value);
                }
            }

            for(Character k : set) {
                sb.append(k);
            }
            ans[i] = sb.toString();
            sb = new StringBuilder();
            set.clear();
        }
        for (String an : ans) {
            if(an != "") {
                System.out.print(an + " ");
            }
        }
    }
}
