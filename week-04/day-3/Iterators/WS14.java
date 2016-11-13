package Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS14 {
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!

        for (Iterator <String> it = al.iterator(); it.hasNext();){
            System.out.println(it.next() + "a");
        }



    }
}
