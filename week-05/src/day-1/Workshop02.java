package week5day1;

/**
 * Created by gabkamabka on 2016.11.14..
 */
public class Workshop02 {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar1 = new Car();
        Car myCar2 = new Car();


        Car[] cars = new Car[3];
        cars[0] = myCar;
        cars[1] = myCar1;
        cars[2] = myCar2;


        myCar.kmOdometer = 12312;
        myCar.typeCar = "Mazda";
        myCar.color = "Red";
        myCar.sizeEngine = 1600;


        myCar1.kmOdometer = 152312;
        myCar1.typeCar = "Ford";
        myCar1.color = "Silver";
        myCar1.sizeEngine = 2500;

        myCar2.kmOdometer = 42521;
        myCar2.typeCar = "Beamer";
        myCar2.color = "Green";
        myCar2.sizeEngine = 2800;

        for (int i = 0; i < 3; i++) {


            System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                    cars[i].typeCar, cars[i].color, cars[i].sizeEngine, cars[i].kmOdometer
            );
        }
    }
}

