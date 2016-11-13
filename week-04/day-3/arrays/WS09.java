package arrays;

import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-12.
 */
public class WS09 {
    public static void main(String[] args) {
        int[] ag = new int[] { 3, 4, 5, 6, 7 };
        // please double all the elements of the list

        for (int i = 0; i <ag.length; i++) {
            ag[i] *=2;

        }

        System.out.println(Arrays.toString(ag));
    }
}
