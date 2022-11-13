package DSA.Hashing.Map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void printFrequencyOfElement(int [] arr) {
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
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 3, 4, 2, 1};

        printFrequencyOfElement(arr);
    }
}
