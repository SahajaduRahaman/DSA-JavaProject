package DSA.Array;

public class SortArraysOfZerosOnesAndTwos {
    public static void sortZeros(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        int temp;

        while (mid <= end) {
            if (arr[mid] == 0) {
                temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                mid ++;
                start ++;
            }
            else if (arr[mid] == 1) {
                mid ++;
            }
            else {
                temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end --;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        sortZeros(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
