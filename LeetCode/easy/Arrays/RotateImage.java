package Arrays;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] expected = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };

        rotate(matrix);

        System.out.println("Expected");
        for (int[] is : expected) {
            System.out.println(Arrays.toString(is));
        }

        System.out.println("Got");
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }

    public static void rotate(int[][] matrix) {
        int[][] rotated = new int[matrix.length][matrix.length];

        // Rotate array
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                rotated[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = rotated[i];
        }
    }
}
