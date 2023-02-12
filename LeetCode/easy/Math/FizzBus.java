package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBus {
    public static void main(String[] args) {
        int n = 15;
        String[] output = { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
                "FizzBuzz" };
        System.out.println("Expected: " + Arrays.toString(output));
        System.out.println("Got: " + fizzBuzz(n).toString());

    }

    public static List<String> fizzBuzz(int n) {
        var list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("FizzBuzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(i + "");
        }
        return list;
    }
}
