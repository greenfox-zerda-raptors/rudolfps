package functions;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS18 {
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        System.out.println(sumNumbers(5));
    }
    public static int sumNumbers(int upperLimit) {
        int sum = 0;
        for (int i = upperLimit; i > 0; i--) {
            sum += i;
        }
        return sum;
    }
}
