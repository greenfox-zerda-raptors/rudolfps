package functions;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS21 {
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(factorial(3));
    }public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }


}
