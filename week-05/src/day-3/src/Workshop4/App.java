package Workshop4;

/**
 * Created by gabrud on 2016-11-16.
 */
import java.util.ArrayList;

public class App {

    final static String[] lsDow = { "MON","TUE","WED","THU","FRI","SAT","SUN"};

    public static void main (String[] args) {
        ArrayList<CreditCardReservation> bookings = new ArrayList<CreditCardReservation>();
        int ct = 10;

        for (int i = 0; i<ct; i++) {
            bookings.add(new CreditCardReservation(randomDow(10),0,"DEF" + i , random16()));
        }

        for (CreditCardReservation iBooking: bookings){
            System.out.println(iBooking.toString());
        }

    }

    static String randomDow(int ct) {
        return lsDow[(int)( Math.random() * 6)];
    }

    static String random16() {
        String out ="";
        for(int i = 0; i<16; i++) {
            out += Integer.toString( (int) ( Math.random() * 9));
        }

        return out;
    }
}