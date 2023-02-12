package Strings;

public class ReverseInt {
    public static void main(String[] args) {
        int x = -123;
        int expected = -321;
        System.out.println(expected);
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        try {
            String result = new StringBuilder(Math.abs(x) + "").reverse().toString();
            return Integer.parseInt(result) * (Math.abs(x) / x);
        } catch (Exception e) {
            return 0;
        }
    }
}
