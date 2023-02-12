package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 45;
        int expected = 1836311903;
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + climbStairs(n));
    }

    public static int climbStairs(int n) {
        int[] control = new int[n];
        if (n < 4)
            return n;
        control[0] = 1;
        control[1] = 2;

        fillArrayClimbing(control, n - 1);
        return control[n - 2] + control[n - 3];
    }

    public static void fillArrayClimbing(int[] arr, int pos) {
        // Check if filled
        if (arr[pos - 1] == 0)
            fillArrayClimbing(arr, pos - 1);

        // Fill
        arr[pos] = arr[pos - 1] + arr[pos - 2];
    }
}
