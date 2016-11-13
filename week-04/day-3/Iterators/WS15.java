package Iterators;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS15 {
    public static void main(String... args) {
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));

        for (String item : al) {
            al.set(al.indexOf(item), item + "a");
        }
        System.out.print(al);
    }
}