package DSA.Sorting;

public class MargeSort {
    public static void margeArray(int [] arr, int low, int mid, int high) {
        int indx1 = low;
        int indx2 = mid+1;
        int k = 0;
        int [] marged = new int[high - low + 1];

        while (indx1 <= mid && indx2 <= high) {
            if (arr[indx1] <= arr[indx2]) {
                marged[k++] = arr[indx1++];
            }
            else {
                marged[k++] = arr[indx2++];
            }
        }
        while (indx1 <= mid) {
            marged[k++] = arr[indx1++];
        }
        while (indx2 <= high) {
            marged[k++] = arr[indx2++];
        }

        for (int i = 0, j = low; i < marged.length; i++, j++) {
            arr[j] = marged[i];
        }
    }
    public static void divideArray(int [] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low)/ 2;

        divideArray(arr, low, mid);
        divideArray(arr, mid+1, high);
        margeArray(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int [] arr = {2, 6, 1, 3, 5, 4};

        divideArray(arr, 0, arr.length-1);

        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
