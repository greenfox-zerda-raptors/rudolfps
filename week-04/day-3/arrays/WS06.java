package arrays;

import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-12.
 */
public class WS06 {
    public static void main(String[] args) {
        int[] t = new int[] { 1, 2, 3, 4, 5 };
        // increment the 3rd element
t[3]= ++ t[3];
        System.out.println(Arrays.toString(t));
    }
}
