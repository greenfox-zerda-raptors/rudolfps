package Arraylists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS11 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list
        System.out.println(list.toString());
    }
}
