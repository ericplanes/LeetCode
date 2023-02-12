package DynamicProgramming;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8 };
        int expected = 23;

        System.out.println("Expected: " + expected);
        System.out.println("Got: " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int best = Integer.MIN_VALUE;
        int current = 0;
        for (int i : nums) {
            current += i;
            best = Math.max(current, best);
            current = Math.max(current, 0);
        }
        return best;
    }

}
