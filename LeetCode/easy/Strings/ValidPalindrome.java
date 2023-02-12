package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            if (!isAlphanumeric(s.charAt(left)))
                left++;
            else if (!isAlphanumeric(s.charAt(right)))
                right--;
            else {
                if (s.charAt(left) != s.charAt(right))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isAlphanumeric(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }

    public static boolean isPalindrome1(String s) {
        // Format String
        String palindrome = "";
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                palindrome += c;
            }
        }

        // Compute palindrome
        char first, last;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            first = palindrome.charAt(i);
            last = palindrome.charAt(palindrome.length() - 1 - i);
            if (first != last)
                return false;
        }
        return true;

    }
}
