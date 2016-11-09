/**
 * Created by gabrud on 2016-11-07.
 */

        public class WS19 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial
            int a = 7;
            System.out.println(factorial(a));
        }

        // create a function that returns it's input factorial

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }
}



