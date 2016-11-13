import jdk.nashorn.internal.ir.WhileNode;

/**
 * Created by gabrud on 2016-11-12.
 */
public class WS34 {
    public static void main(String[] args) {
        for (int i = 0; i <=100 ; i++) {
            if (i%15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0) {
                System.out.println("Buzz");
            }
            System.out.println(i);
}








        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
        System.out.println();
    }
}
