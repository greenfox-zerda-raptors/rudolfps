/**
 * Created by gabrud on 2016-11-03.
 */
public class WS36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable
String cross = "#";
        for (int a = 1; a<=5; a++){
            for (int j = 1; j <= 5; j++)
                {
                    System.out.print(cross);
                }

            System.out.println();

        }

    }

}
