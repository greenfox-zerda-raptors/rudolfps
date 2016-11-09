/**
 * Created by gabrud on 2016-11-06.
 */
public class WS13 {
    public static void main(String[] args) {
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        // print the sum of all numbers in ah
        int sum = 0;

        for( int num : ah) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }



}
