import java.util.Arrays;

/**
 * Created by gabkamabka on 2016.12.06..
 */
public class Accumulate {
    public static void main(String[] args) {

    }

    public static String accumul(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String dash = "-";

        if (s.length() > 1) {

            for (int i = 0; i < s.length(); i++) {
                s.charAt(i);
                s1 = Character.toString(s.charAt(0)).toUpperCase();
                s2 = Character.toString(s.charAt(1)).toUpperCase();
               // s3 = Character.toString(s.charAt(2)).toUpperCase();
              //  s4 = Character.toString(s.charAt(3)).toUpperCase();
            }

            //for (int i = 0; i < ; i++) {
            return s1 + dash + s2 + s2.toLowerCase();

        }return s.toUpperCase();

    }

}