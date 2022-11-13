package DSA.Hashing.Map;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateElement {
    public static void RemoveDuplicate(int [] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 1, 3, 4, 2, 1};

        RemoveDuplicate(arr);
    }
}
