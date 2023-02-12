package Arrays;

class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 2, 2, 3 };
        int[] expectedNums = { 0, 1, 2, 3 };
        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println("Correcte");
    }

    // Function to complete
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
