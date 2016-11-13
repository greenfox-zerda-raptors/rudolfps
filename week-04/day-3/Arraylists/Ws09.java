package Arraylists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-13.
 */
public class Ws09 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("second", "third", "fourth"));
        // Add "first" to the beginning of the list and add "fifth" to the end of the list
        // Expected output: [first, second, third, fourth, fifth]
        list.add(0,"first");
        list.add(4, "fifth");
        System.out.println(list);
    }
}
