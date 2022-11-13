package DSA.Hashing.Map;

import java.util.HashMap;

public class FindDuplicateElement {
    public static void printDuplicateElement(int [] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int ans = 0;

        for (int j : arr) {

            if (hm.containsKey(j)) {
                hm.put(j, hm.get(j) + 1);
                ans = j;
                break;
            } else {
                hm.put(j, 1);
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        int [] arr = {6, 2, 5, 1, 3, 4, 6};

        printDuplicateElement(arr);
    }
}
