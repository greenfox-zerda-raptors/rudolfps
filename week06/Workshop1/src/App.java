import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gabkamabka on 2016.11.21..
 */
public class App {
    public static void main(String[] args) {
        Apple myapple = new Apple();
        System.out.println(myapple.name);
        App aba = new App();

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        aba.sum(myList);
    }

    public static int sum(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        System.out.println(sum);
        return sum;
    }
}



