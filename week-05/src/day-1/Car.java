package week5day1;

/**
 * Created by gabkamabka on 2016.11.14..
 */
public class Car {
    String color;
    String typeCar;
    int sizeEngine;
    int kmOdometer;




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public Car() {
        this.color = getColor();
        this.sizeEngine = getSizeEngine();
        this.kmOdometer = getKmOdometer();
        this.typeCar = getTypeCar();
    }

   public void drive (){
      int drive = getKmOdometer() + 15;
      kmOdometer = kmOdometer +15;
       System.out.printf("The brrrm" + " " + "the" + " " + getColor() + " " + getTypeCar() + " " + "just drove 15 clicks" );

    }

    public String toString() {
        return "This" +" " + this.color +" " + this.typeCar + ", has"+" " + this.getSizeEngine()+ " cc engine and clocked"+" " + this.getKmOdometer() + "km's.";


    }


}




