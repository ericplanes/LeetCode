package Arrays;

import java.util.HashSet;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        var numSet = new HashSet<Integer>(nums.length, 1.0f);
        for (int num : nums) {
            if (!numSet.add(num))
                return true;
        }
        return nums.length != numSet.size();
    }
}
