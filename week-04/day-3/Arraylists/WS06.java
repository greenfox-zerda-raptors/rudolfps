package Arraylists;

import java.util.ArrayList;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS06 {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        // Accidentally we added number 3 twice. Your task is to remove it from the list
        arrayList.set(3,3);
        arrayList.remove(3);
        System.out.println(arrayList);
    }
}
