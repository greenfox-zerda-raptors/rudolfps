/**
 * Created by gabrud on 2016-11-03.
 */
public class WS34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".

        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }

        }
    }
}
