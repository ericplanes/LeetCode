package Design;

import java.util.Random;

class ShuffleAnArray {
    private int[] nums;
    private int[] initial;
    Random random = new Random();

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.initial = nums.clone();
    }

    public int[] reset() {
        this.nums = initial.clone();
        return this.nums;
    }

    public int[] shuffle() {
        int n = this.nums.length;
        int random;
        for (int i = n - 1; i > 0; i--) {
            random = this.random.nextInt(i + 1);
            swap(i, random);
        }
        return this.nums;
    }

    private void swap(int a, int b) {
        int pivot = this.nums[a];
        this.nums[a] = this.nums[b];
        this.nums[b] = pivot;
    }
}