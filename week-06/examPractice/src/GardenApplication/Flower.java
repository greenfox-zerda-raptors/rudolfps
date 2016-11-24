package GardenApplication;

/**
 * Created by gabkamabka on 2016.11.24..
 */
public class Flower extends Plant {
    public Flower (String color){
        super(color, 0);
    }

    @Override
    public boolean isThirsty() {/////ha kisebb mint a5  a wateramount akkor truet ad vissza
        return currentWaterAmount < 5;
    }

    @Override
    public void water(int waterPerPlant) { ////
        currentWaterAmount += (int) ((float)waterPerPlant * 0.75);

    }
}
