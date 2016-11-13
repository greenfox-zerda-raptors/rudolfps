package Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS17 {

    public static void main(String... args){
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 ));
        // Fix this code fragment! It should remove every even number from the list.

        for(Iterator<Integer> it = al.iterator(); it.hasNext();) {
            int element = it.next();
            if(element % 2 == 0){
                it.remove();
            }
        }
        System.out.println(al);
    }
}
