import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by gabrud on 2016-11-07.
 */
public class Workshop5 {
    public static void main(String... args) {
        ArrayList<Integer> numList = new ArrayList <Integer> (Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array

        int [] new = new int[numList.size()];
        for (int i = 0; i < numlist.length; i++) {
            new[i] = numList.get [i];

        }
        System.out.println(new);

    }
}
