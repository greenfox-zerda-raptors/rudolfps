/**
 * Created by gabrud on 2016-11-12.
 */
public class WS27 {
    public static void main(String[] args) {
        String y = "seasons";
        int out = 6;
        int firstIndex = y.charAt(0);
        int lastIndex =y.charAt(6);
        // if the last and the first letter of the string
        // are the same double the variable
        // called out, if not half it
        if (firstIndex == lastIndex){
           out = out*2;
        }else {
            out = out/2;}
        System.out.println(out);
    }
}
