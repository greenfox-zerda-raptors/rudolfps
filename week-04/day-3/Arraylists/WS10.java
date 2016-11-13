package Arraylists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS10{
        public static void main(String... args){
            ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "sixth", "third", "fourth", "fifth"));
            // Accidentally I added "sixth" instead of "second"! Your task is to swap "sixth" with "second"
            list.set(1, "second");
            System.out.println(list);
        }
}
