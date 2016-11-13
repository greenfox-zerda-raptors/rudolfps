package functions;

/**
 * Created by gabrud on 2016-11-13.
 */
public class Ws16 {
        public static void main(String[] args) {
            String ae = "Misi";
            // create a function that greets ae

            System.out.println(welcome(ae));
        }

        public static String welcome(String greet) {
            return "Hello " + greet + "!";
        }
    }
