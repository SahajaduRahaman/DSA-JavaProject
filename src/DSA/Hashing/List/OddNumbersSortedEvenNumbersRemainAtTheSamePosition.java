package DSA.Hashing.List;

import java.util.ArrayList;
import java.util.Collections;

public class OddNumbersSortedEvenNumbersRemainAtTheSamePosition {
    static void solve(int []arr, int n) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                odd.add(arr[i]);
        }

        Collections.sort(odd);

        int l = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = odd.get(l++);
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 5, 6, -1, 7, 8};

        solve(arr, arr.length);
    }
}
