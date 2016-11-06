/**
 * Created by gabrud on 2016-11-06.
 */
public class primes {
    public static void main(String[] args) {

        {
            int i, j;
            System.out.print("Prime numberss from 0 to 100 are,");
            for (i = 3; i <= 200; i++) {
                for (j = 2; j < i; j++) {
                    if (i % j == 0)
                        break;
                }
                if (i == j)
                    System.out.print(i + ",");
            }
        }
    }
}
