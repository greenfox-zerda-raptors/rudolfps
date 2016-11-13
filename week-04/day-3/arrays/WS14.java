package arrays;

import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS14 {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };

        for(int i = 0; i < ah.length / 2; i++)
        {
            int temp = ah[i];
            ah[i] = ah[ah.length - i - 1];
            ah[ah.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(ah));
    }
}
