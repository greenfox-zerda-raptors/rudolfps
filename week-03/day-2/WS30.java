/**
 * Created by gabrud on 2016-11-03.
 */
public class WS30 {
    public static void main(String[] args) {
        int ac = 8;
        int time = 120;
        String out = "";
        // if ac is dividable by 4
        // and time is not more than 200
        // set out to 'check'
        // if time is more than 200
        // set out to 'Time out'
        // otherwise set out to 'Run Forest Run!'

        if (ac % 4 == 0 && time <= 200) {
            System.out.println(out = "check");
        }
        else if (time > 200) {
            System.out.println(out = "Time out");
        }
        else
            System.out.println(out = "Run Forest Run");
        }
    }






