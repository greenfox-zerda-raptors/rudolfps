/**
 * Created by gabrud on 2016-11-07.
 */
public class Workshop19 {
    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder

        builder.delete(3, 4);
        builder.insert(3, "l");
        builder.append(" " + name);



        System.out.println(builder);
    }
}
