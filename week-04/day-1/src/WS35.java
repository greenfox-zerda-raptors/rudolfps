/**
 * Created by gabrud on 2016-11-12.
 */
public class WS35 {public static void main(String[] args) {
    // Write a program which has this output
    // 1******
    // 12*****
    // 123****
    // 1234***
    // 12345**
    // 123456*
    // 1234567
    String k = "*******";
    for (int i = 1; i <8 ; i++) {
        k = k.replaceFirst("\\*", Integer.toString(i));
        System.out.println(k);
    }
  }
}
