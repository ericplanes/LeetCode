package Arrays;

import java.util.Arrays;

class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 17;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        System.out.println("[5, 6, 7, 1, 2, 3, 4]");
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] left = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] right = Arrays.copyOfRange(nums, 0, nums.length - k);

        for (int i = 0; i < nums.length; i++) {
            if (i < left.length) {
                nums[i] = left[i];
            } else {
                nums[i] = right[i - left.length];
            }
        }
    }
}