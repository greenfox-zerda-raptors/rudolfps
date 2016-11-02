/**
 * Created by gabrud on 2016-11-02.
 */
public class Workshop11{
    public static void main(String[] args) {
        int k = 1521;
        // tell if k is dividable by 3 or 5

        if (k % 3 == 0 ^ 7 == 0) {
            System.out.println(k + " is divisible by 3 or 5. ");
        }
        else if (k % 3 == 0 || 7 == 0)
        {
            System.out.println(k + " is divisble by either 3 or 5. but not both ");
        }
        if (k % 3 == 0 && 7 == 0)
        {
            System.out.println(k + " is divisble by both 3 and 5 ");
        }
    }




    }
