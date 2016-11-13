package Srtingbuilder;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS19 {
    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder
builder.replace(2,4,"ll");
        builder.append(" "+ name + "!");
        System.out.println(builder);
    }
}
