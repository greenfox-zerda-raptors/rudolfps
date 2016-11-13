package functions;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS15 {
    public static void main(String[] args) {
        int af = 123;
        // create a function that doubles it's input
        // double af with it
        System.out.print(doubleIt(af));

    }

    private static int doubleIt(int i) {
        i = i * 2;
        return i;

    }
}