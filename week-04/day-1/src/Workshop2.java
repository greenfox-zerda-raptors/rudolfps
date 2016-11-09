import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gabrud on 2016-11-07.
 */
public class Workshop2 {
    public static void main(String... args) {
        String[] numbers = new String[]{"one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array

        ArrayList <String> nums = new ArrayList <String>(Arrays.asList(numbers));

            System.out.println(nums.toString());

        }
    }
