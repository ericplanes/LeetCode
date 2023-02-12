package SortingAndSearching;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String args[]) {
        int[] arrFirst = { 4, 0, 0, 0, 0, 0 }, arrSec = { 1, 2, 3, 5, 6 };
        int first = 1, second = 5;

        int[] expected = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(expected));
        merge(arrFirst, first, arrSec, second);
        System.out.println(Arrays.toString(arrFirst));
    }

    // O(n + m)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, idx = m + n - 1;
        // Order merging two
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[idx] = nums1[i];
                i--;
            } else {
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }

        // Fill up with remaining
        while (i >= 0) {
            nums1[idx] = nums1[i];
            i--;
            idx--;
        }
        while (j >= 0) {
            nums1[idx] = nums2[j];
            j--;
            idx--;
        }
    }

    // O(n + m + n * log(n))
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}
