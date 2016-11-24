package primeFactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabkamabka on 2016.11.22..
 */
public class PrimeFactors {
    public static List<Integer> generate(int n) {
        //  return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        //int candidate = 2;
        for(int candidate = 2; n > 1; candidate++)
       // while (n > 1) {
            for (; n % candidate == 0; n /= candidate ){
                result.add(candidate);
            }
        //while (n % candidate == 0) {
                 //   result.add(candidate);
                //  n /= candidate;
                //*}
                // candidate++
        return result;
     }
}
