package Srtingbuilder;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS21 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first third fourth");
        // Add "second" to the StringBuilder (sb) between the words "first" and "third"
        // Expected outpt: first second third fourth
        sb.insert(6,"second" + " ");


        System.out.println(sb.toString());
    }
}
