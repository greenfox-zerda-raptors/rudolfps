package GardenApplication;

import java.util.ArrayList;

/**
 * Created by gabkamabka on 2016.11.24..
 *////csak az arraylist tet hívom meg mert a tulajdonságait tudom használni
public class Garden extends ArrayList<Plant> {


    public String water(int amount) {
        int numberOfThirsty = 0;
        for (Plant p : this) {
            if (p.isThirsty()) {
                numberOfThirsty++;
            }
        }
        //konvertálom floattá az osztás eredményét
        int waterPerPlant = (int) ((float) amount / numberOfThirsty);
        for (Plant p : this) {
            if (p.isThirsty()) {
                p.water(waterPerPlant);
            }
        }

        return "watering with" + amount;
    }

    @Override  //// azért csináljuk, hogy ki tudjuk iratni a garden elemeit
    public String toString() {
        String result = "";
        for (Plant p:this) {
            result += p.toString() + "\n";
        }
        return result;
    }
}
