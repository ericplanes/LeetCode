package DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = { 10, 1, 1, 10, 13, 2, 5 };
        int expected = 29;
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + getMaxSum(nums));
    }

    public static int getMaxSum(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int n = nums.length;
        int[] aux = new int[n];

        aux[0] = nums[0];
        aux[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            aux[i] = Math.max(aux[i - 1], aux[i - 2] + nums[i]);
        }

        return aux[n - 1];
    }
}
