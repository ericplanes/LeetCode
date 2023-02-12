package Strings;

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        int expected = 4;
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int strStr1(String haystack, String needle) {
        int pos = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(pos)) {
                pos++;
                if (pos == needle.length())
                    return (i + 1) - pos;
            } else {
                i = i - pos;
                pos = 0;
            }
        }
        return -1;
    }
}
