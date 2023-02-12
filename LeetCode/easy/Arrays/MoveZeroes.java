package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 0, 3, 12 };
        System.out.println("Expected: [1, 3, 12, 0, 0]");
        moveZeroes(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void moveZeroes(int[] numbers) {
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[j] = numbers[i];
                j++;
            }
        }
        while (j < numbers.length) {
            numbers[j] = 0;
            j++;
        }
    }
}
