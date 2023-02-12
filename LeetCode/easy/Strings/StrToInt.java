package Strings;

public class StrToInt {
    public static void main(String[] args) {
        String number = "2147483646";
        System.out.println(myAtoi(number) + " == " + "2147483647");
    }

    public static int myAtoi(String s) {
        int i = 0, n = 1;
        int number = 0;

        // Ignore any initial white space
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check + or -
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                n *= -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        // Read number
        while (i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
            number = (long) number * 10 > Integer.MAX_VALUE - (s.charAt(i) - '0') ? Integer.MAX_VALUE : number * 10;
            if (number == Integer.MAX_VALUE) {
                switch (n) {
                    case -1:
                        return Integer.MIN_VALUE;
                    case 1:
                        return Integer.MAX_VALUE;
                }
            }
            number += s.charAt(i) - '0';
            i++;
        }
        return number * n;
    }
}
