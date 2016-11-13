package project;

import java.util.Scanner;

/**
 * Created by gabrud on 2016-11-13.
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuity= true;
        while (continuity) {

            System.out.println("Enter a string:");


            String s1 = scanner.nextLine();
            StringBuilder s2 = new StringBuilder(s1);
            s2.reverse();

            if (s1.equals(s2.toString())) {
                System.out.println("It`s a palindrome");
            } else {
                System.out.println("It`s not apalindrome");
            }

            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (scanner.next().toUpperCase()).charAt(0);
            continuity = (response == 'Y');;
        }

    }

}