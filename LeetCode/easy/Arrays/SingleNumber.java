package Arrays;

import java.util.Arrays;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 4, 2 };
        System.out.println(Arrays.toString(nums));
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }
}
