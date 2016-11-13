/**
 * Created by gabrud on 2016-11-12.
 */
public class WS28 {
    public static void main(String[] args) {
        int z = 13;
        // if z is between 10 and 20 print 'Sweet!'
        // if less than 10 print 'More!',
        // if more than 20 print 'Less!'
        if (z >= 10 && z <= 20 ){
            System.out.println("Sweet");
        }else if (z > 20){
            System.out.println("Less");
        }else {
            System.out.println("More");
        }

    }
}
