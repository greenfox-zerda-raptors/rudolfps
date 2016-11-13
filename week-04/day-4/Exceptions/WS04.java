package Exceptions;
import java.util.*;
/**
 * Created by gabrud on 2016-11-13.
 */
public class WS04 {
    /**************************************************************************************************
     * Workshop: Practice Exceptions: Cascading problems
     *
     * What if there are lots of different types of errors?
     *
     * We've got an array and a mad man writing idiotic code (me!).  Deal with my mayhem and get to
     * the ::::FINISH LINE::::
     *
     * Note that there should not be Compile Time errors.
     *
     **************************************************************************************************/


        public static void main(String[] args){
try {


            int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
            String two = "2";
                try {


            System.out.println("Testing ...");
            a[2] = a[3]/a[0];
                }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
                try {
            System.out.println("Past hurdle 1");
            a[9] = Integer.parseInt(two);
                }catch (ArrayIndexOutOfBoundsException e2){
                System.out.println(e2.getMessage());
            }
                try {
            System.out.println("Past hurdle 2");
            a[10] = Integer.parseInt("ten");
                }catch (NumberFormatException e3){
             System.out.println(e3.getMessage());
            }
            System.out.println("Past hurdle 3...  And I realized perhaps I'm wrong");
            a[10] = 10;
                 try {
            System.out.println("Past hurdle 4");
            two = "two";
            System.out.println("Past hurdle 5");
            a[9] = Integer.parseInt(two);
                 }catch (ArrayIndexOutOfBoundsException e4){
                System.out.println(e4.getMessage());
            }

            System.out.println("*** FINISH LINE ***");
}catch (Exception e5){
    System.out.println(e5.getMessage());
}
        }
    }


