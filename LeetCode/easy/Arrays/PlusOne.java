package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 9, 9, 9 };
        System.out.println("Expected: [9, 0, 0]");
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        // Compute plus one
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] % 10 != 0)
                break;
            else {
                digits[i] = 0;
            }
        }

        // If no need to increase array, return
        if (digits[0] != 0) {
            return digits;
        }

        // Increase one position the array
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
