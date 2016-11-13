package functions;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS19 { public static void main(String[] args) {
    // create a function that returns it's input factorial

    System.out.println(factorial(5));
}public static int factorial(int upperLimit) {
    int factor = 1;
    for (int i = upperLimit; i > 0; i--) {
        factor *= i;
    }
    return factor;
}
}
