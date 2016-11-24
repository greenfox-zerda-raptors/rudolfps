import GardenApplication.Flower;
import GardenApplication.Garden;
import GardenApplication.Tree;

/**
 * Created by gabkamabka on 2016.11.24..
 */
public class GardenApp {

    public static void main(String[] args) {

        Garden garden = new Garden();
        garden.add(new Flower("yellow"));
        garden.add(new Flower("blue"));
        garden.add(new Tree("purple"));
        garden.add(new Tree("orange"));

        System.out.println(garden);
        ///watering with 40 and souting the same time
        System.out.println(garden.water(40));
        System.out.println(garden);
        System.out.println(garden.water(70));
        System.out.println(garden);

    }
}
