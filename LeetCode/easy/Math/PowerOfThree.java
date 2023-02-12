package Math;

public class PowerOfThree {

    public static void main(String[] args) {
        int n = 1;
        boolean expected = true;
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        while (n > 3) {
            if (n % 3 != 0)
                return false;
            n /= 3;
        }
        return n == 3;
    }
}
