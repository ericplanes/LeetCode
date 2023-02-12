package Strings;

public class FirstUniqChar {
    public static void main(String[] args) {
        String str = "z";
        int expected = 0;
        System.out.println(expected + " == " + firstUniqChar(str));
    }

    public static int firstUniqChar(String s) {
        int[] register = new int[128];
        for (char c : s.toCharArray()) {
            register[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (register[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
