package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        boolean expected = true;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i])
                return false;
        }

        return true;
    }
}
