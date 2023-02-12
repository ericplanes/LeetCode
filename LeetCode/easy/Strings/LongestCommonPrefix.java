package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flowly" };
        String expected = "flow";
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (first.length() > 0) {
                if (strs[i].indexOf(first) != 0) {
                    first = first.substring(0, first.length() - 1);
                    continue;
                }
                break;
            }
        }
        return first;
    }
}
