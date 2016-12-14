import java.util.HashMap;

/**
 * Created by gabkamabka on 2016.12.06..
 */
public class NumberConverter {
    public static void main(String[] args) {

    }

    public static String arabicToRoman(int arabic) {
        StringBuilder result = new StringBuilder();

        String [] symbols = new String [] {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        Integer [] values = new Integer[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


        int remaining = arabic;


        for (int i = 0; i < values.length ; i++) {
            remaining = appendRomanNumeral(remaining, values[i], symbols[i], result);
        }

        for (int i = 0; i < remaining; i++) {
            result.append("I");
        }
        while (remaining >= 1)
        {result.append("I");
        remaining -= 1;

        }
        return result.toString();
    }

    private static int appendRomanNumeral(int numeral, int value, String romanSymbol, StringBuilder builder) {
        while (numeral >= value) {
            builder.append(romanSymbol);
            numeral -= value;
        }
        return numeral;
    }
}


//hashmap//

/*   HashMap<Integer, String> numberToSymbol = new HashMap<Integer, String>() {
            {
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
            }
        };
        */


//Kezdetek//
  /*  if (remaining >= 9) {
            result.append("IX");
            remaining -= 9;
        }
        if (remaining >= 5) {
            result.append("V");
            remaining -= 5;
        }
        if (remaining >= 4) {
            result.append("IV");
            remaining -= 4;
        }*/


  //abszolut kezdetek//
   /*/*   if (i == 1) {
            return "I";
        }else if (i ==2){
            return "II";
        }else {
            return "III";
        }*/