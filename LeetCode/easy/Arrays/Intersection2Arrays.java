package Arrays;

import java.util.Arrays;

public class Intersection2Arrays {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };
        System.out.println("expected: [4, 9]");
        System.out.println("result: " + Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Compare arrays to find intersection
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length && k < result.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                result[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }

        // Return result
        return Arrays.copyOfRange(result, 0, k);
    }
}
