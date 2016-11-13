package Srtingbuilder;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS22 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first second third third");
        // Accidentally I inserted the word "third" twice. Your task is to change the last word to "fourth"
        // Expected outpt: first second third fourth
        sb.replace(19,30, "fourth");

        System.out.println(sb.toString());
    }
}
