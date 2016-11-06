/**
 * Created by gabrud on 2016-11-03.
 */
public class WS22 { public static void main(String... args){
    String first = "I am the first string!";
    String second = "I think I'm longer than first..";
    // Decide if "first" string is longer than "second" string and store it in a variable
    // Print the value of the variable

    int firstlength = first.length();
    int secondlength = second.length();
    boolean comparisonResult = firstlength > secondlength;


    System.out.println(comparisonResult);
}
}


