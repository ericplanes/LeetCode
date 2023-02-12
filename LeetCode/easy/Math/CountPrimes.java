package Math;

public class CountPrimes {
    public static void main(String args[]) {
        int n = 499979;
        int expected = 4;
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + countPrimes(n));
    }

    public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 1;
        for (int i = 3; i < n; i += 2) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return n < 3 ? 0 : count;
    }
}
