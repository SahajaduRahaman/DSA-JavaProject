package DSA.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterFromString {
    private static void firstNonRepeatedCharacter(String Str) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for (Character ch : Str.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            }
            else {
                hm.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> mp : hm.entrySet()) {
            if (mp.getValue() == 1) {
                System.out.print(mp.getKey() + " ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcrsabghrpplkt";

        firstNonRepeatedCharacter(str);
    }
}
