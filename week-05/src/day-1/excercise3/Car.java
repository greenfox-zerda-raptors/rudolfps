package week5day1.excercise3;

/**
 * Created by gabkamabka on 2016.11.14..
 */
   public  class Car {

        //note that these are now private!
        private int sizeEngine;
        private String color;
        private int kmOdometer;
        private String tyCar;

    public int getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public String getTyCar() {
        return tyCar;
    }

    public void setTyCar(String tyCar) {
        this.tyCar = tyCar;
    }
    //Add something here to access the various fields

        public Car(){
            sizeEngine = 1600;
            color = "red";
        }
    }

