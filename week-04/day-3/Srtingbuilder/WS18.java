package Srtingbuilder;

/**
 * Created by gabrud on 2016-11-13.
 */
public class WS18 {
    public static void main(String... args){
        String example = "A long example string";


        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string

        StringBuilder a = new StringBuilder(example);
        a.replace(2,6, "short");


        System.out.println(a);
    }
}
