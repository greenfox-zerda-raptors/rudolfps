package Iterators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS13 {public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
    // Print all elements of the list using a for loop and an Iterator
    for (Iterator <String> it = list.iterator(); it.hasNext();){
        System.out.println(it.next());
    }
    }
}
