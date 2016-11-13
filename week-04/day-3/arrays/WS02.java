package arrays;

/**
 * Created by gabrud on 2016-11-12.
 */
public class WS02 {
    public static void main(String... args) {
        int[] p1 = new int[] { 1, 2, 3 };
        int[] p2 = new int[] {4, 5 };
        // tell if p2 has more elements than p1
        boolean h = p1.length < p2.length;



        System.out.println(h);
    }
}
