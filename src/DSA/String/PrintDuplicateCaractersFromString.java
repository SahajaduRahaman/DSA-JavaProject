package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCaractersFromString {
    private static void printDuplicateChar(String Str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (Character ch : Str.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            }
            else {
                hm.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> mp : hm.entrySet()) {
            if (mp.getValue() > 1) {
                System.out.print(mp.getKey() + " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcrsabghrpplkt";

        printDuplicateChar(str);
    }
}
