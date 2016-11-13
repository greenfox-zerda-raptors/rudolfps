package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-12.
 */
public class WS04 {
    public static void main(String[] args) {
        int[] s = new int[] { 1, 2, 3, 8, 5, 6 };
        // change the 8 to 4
       s[3]= 4;
        System.out.println(Arrays.toString(s));
    }
}
