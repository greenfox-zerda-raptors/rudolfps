package Arraylists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS05 {
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array
        Integer[] trattata = numList.toArray(new Integer[numList.size()]);
        System.out.println(numList);
    }
}
