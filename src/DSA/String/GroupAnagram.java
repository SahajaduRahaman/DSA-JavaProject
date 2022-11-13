package DSA.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> getAnagram(String [] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();

        for (String s : strs) {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);

            if (hm.containsKey(temp)) {
                hm.get(temp).add(s);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(temp, list);
            }
        }
        for (String s : hm.keySet()) {
            ans.add(hm.get(s));
        }
        return ans;
    }
    public static void main(String[] args) {
        String [] str = {"ate", "bat", "eat", "fun", "unf", "tea"};

        List<List<String>> list = getAnagram(str);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
