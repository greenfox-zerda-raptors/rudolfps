package GardenApplication;

/**
 * Created by gabkamabka on 2016.11.24..
 */
public abstract class Plant {

    String color;
    int currentWaterAmount;
//miután meghatározom a fieldeket, kelle gy konstruktor alattuk, hogy lehessen setelni
    public Plant(String color, int currentWaterAmount) {
        this.color = color;
        this.currentWaterAmount = currentWaterAmount;
    }
//ha nem itt akarom módosítani akkor abstractá változtatom, ebben az esetben nenm kell kapcsos zárójel sem return érték.
    public abstract boolean isThirsty();

    public abstract void water(int waterPerPlant);

    @Override
    public String toString() {         ///Flower és treee név megjelenítése
        return "The" + " " + color + " " + getClass().getSimpleName()
                + (isThirsty() ? " needs water" : " does not need water");
    }
}
