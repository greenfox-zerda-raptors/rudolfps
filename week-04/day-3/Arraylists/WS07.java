package Arraylists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS07 {
    public static void main(String... args){
        ArrayList<String> arrayList = new ArrayList<String>();
        int random = new Random().nextInt(20);
        for(int i=0;i<20;i++){
            if(i == random){
                arrayList.add("removable");
            }
            arrayList.add("" + i);
        }
        // Remove "removable" from the list, but without using the index of the element.
        arrayList.remove("removable");

        System.out.println(arrayList);
    }
}
