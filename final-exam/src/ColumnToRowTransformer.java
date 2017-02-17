import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ${rudolfps} on 2017.02.17..
 */
public class ColumnToRowTransformer {


    public void Converter(ArrayList<String[]> arr) {
       arr = new ArrayList<String[]>();
        arr.add(new String[]{"a", "b", "c"});
        arr.add(new String[]{"i", "j", "k"});
        arr.add(new String[]{"x", "y", "z"});

        ArrayList<String[]> result = new ArrayList<String[]>();
        int I = arr.get(0).length;
        int Y = arr.size();
        for (int i = 0; i != I; i++) {
            String[] row = new String[Y];
            for (int y = 0; y!= Y; y++) {
                row[y] = arr.get(y)[i];
            }
            result.add(row);


            for (String[] res : result) {
                System.out.println(Arrays.toString(res));
            }
        }
    }
}