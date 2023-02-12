package Strings;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        char[] expected = { 'o', 'l', 'l', 'e', 'h' };
        reverseString(s);
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        char pivot;
        for (int i = 0; i < s.length / 2; i++) {
            pivot = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = pivot;
        }
    }

}