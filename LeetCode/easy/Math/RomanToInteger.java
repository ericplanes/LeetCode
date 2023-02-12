package Math;

public class RomanToInteger {
    public static void main(String args[]) {
        String s = "MCMXCIV";
        int expected = 1994;
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + romanToInt(s));
    }

    public static int romanToInt(String s) {
        int value = 0, num;
        for (int i = s.length() - 1; i >= 0; i--) {
            num = conversor(s.charAt(i));
            if (num * 4 < value)
                value -= num;
            else
                value += num;
        }
        return value;
    }

    private static int conversor(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
