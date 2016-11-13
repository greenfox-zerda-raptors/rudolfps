package Srtingbuilder;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS20 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("second line\n");
        // Add "first line" to the beginning of the sb
        // Add "third line" to the end of the sb
        // Expected outpt:
        // first line
        // second line
        // third line
sb.insert(0, "first line\n");
        sb.append("third line");

        System.out.println(sb.toString());
    }
}
