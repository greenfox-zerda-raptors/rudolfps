package arrays;

import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS011 {
    public static void main(String[] args) {
        String[] ah = new String[] {"kuty", "macsk", "cic" };
        // add to all elements an 'a' on the end

        for (int i = 0; i <ah.length; i++) {
          ah[i] += "a";
        }System.out.println(Arrays.toString(ah));
    }
       

}


