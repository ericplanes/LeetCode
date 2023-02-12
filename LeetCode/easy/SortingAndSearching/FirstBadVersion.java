package SortingAndSearching;

public class FirstBadVersion {
    private static final int bad = 234;

    private static boolean isBadVersion(int version) {
        if (version < bad)
            return false;
        return true;
    }

    public static void main(String args[]) {
        int n = 53252;
        System.out.println("Expected: " + bad);
        System.out.println("Got: " + firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int first = 1, last = n;
        while (first < last) {
            n = first + (last - first) / 2;
            if (isBadVersion(n))
                last = n;
            else
                first = n + 1;
        }
        return first;
    }

    // Exceeds time
    public static int firstBadVersion2(int n) {
        int first = 0, last = n;
        while (last > first) {
            n = first + (last - first) / 2;
            if (isBadVersion(n))
                last = n;
            else
                first = n + 1;
        }
        return first;
    }
}
