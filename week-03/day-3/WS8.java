/**
 * Created by gabrud on 2016-11-04.
 */
public class WS8 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        int d [][];
        d = new int[4][4];
        d[0][0] = 1;
        d[1][1] = 1;
        d[2][2] = 1;
        d[3][3] = 1;

        for (int i=0; i<d.length; i++) {
            for (int j = 0; j < d[0].length; j++)
            {
            System.out.print(d[i][j] + " ");}
            System.out.println();
        }




        // Task 2: Print this two dimensional array to the output

        System.out.println();
    }
}
