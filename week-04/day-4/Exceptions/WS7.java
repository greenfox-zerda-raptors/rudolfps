package Exceptions;
import java.util.*;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS7 {



        static void myMethod(int inNumber) throws Exception // something should appear here before
        {
            if (inNumber == 7) // do that thing that chucks the reprobate out
                // something here
              throw new Exception();
            return;
        }

        public static void main(String[] args){

            Scanner userInput = new Scanner(System.in);
            int myValue;
            String prompt = "Enter a value from 1 to 9 or 0 to exit?";

            System.out.println(prompt);
            while (userInput.hasNextInt()) {
                myValue = userInput.nextInt();
                if (myValue == 0) {
                    break;
                } else {
                    try {
                        System.out.println("try - first statement");
                        myMethod(myValue);
                        System.out.println("try - last statement");
                    } catch (Exception ex) {
                        System.out.println("An Exception occurred: " + ex.getMessage());
                    }
                }
            } //while
        } // main
    } //Workshop

