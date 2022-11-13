package DSA.Array;

public class MedianOfTwoSortedArrays {
    public static double findMedian(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int [] newArr = new int[l1 + l2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                newArr[k++] = nums1[i++];
            }
            else {
                newArr[k++] = nums2[j++];
            }
        }

        while (i < l1) {
            newArr[k++] = nums1[i++];
        }

        while (j < l2) {
            newArr[k++] = nums2[j++];
        }

        double mid;

        if (newArr.length % 2 != 0) {
            mid = newArr[newArr.length / 2];
        }
        else {
            double x = newArr[newArr.length / 2];
            double y = newArr[(newArr.length / 2) - 1];
            mid = (x + y) / 2;
        }

        return mid;
    }
    public static void main(String[] args) {
        int [] fArr = {1, 2};
        int [] sArr = {3, 4};

        System.out.println(findMedian(fArr, sArr));
    }
}
