package Arraylists;

import java.util.ArrayList;

/**
 * Created by gabrud on 2016-11-13.
 */
public class Ws01 {
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(5);
        arrayList.add(25);
        arrayList.add(4);
        arrayList.add(12);
        arrayList.add(35);
        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(111);

        // Add multiple elements to the list and print the number of the elements

        System.out.println(arrayList.size());
    }
}
