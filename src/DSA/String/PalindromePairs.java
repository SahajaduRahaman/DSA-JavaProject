package DSA.String;

import java.util.*;

public class PalindromePairs {
    public static List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        int n = words.length;

        for(int i = 0; i < n; i++){
            hm.put(reverse(words[i]), i);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for (int j = 0; j < words[i].length(); j++) {
                String prefix = words[i].substring(0, j);
                String sufix = words[i].substring(j);

                List<Integer> list = new ArrayList<>();

                if (isPalindrome(prefix)) {
                    if (hm.containsKey(sufix) && i != hm.get(sufix)) {
                        list.add(hm.get(sufix));
                        list.add(i);
                        ans.add(list);
                    }
                }

                if (isPalindrome(sufix)) {
                    if (hm.containsKey(prefix) && i != hm.get(prefix)) {
                        list.add(hm.get(prefix));
                        list.add(i);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }
    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
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
    public static String reverse(String s) {
        int high = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = high-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String [] str = {"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> result = palindromePairs(str);

        for (List<Integer> integers : result) {
            System.out.print(integers + " ");
        }
    }
}
