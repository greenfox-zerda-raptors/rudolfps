package week5day1;

import week5day1.*;

/**
 * Created by gabkamabka on 2016.11.14..
 */
public class Workshop01 {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar1 = new Car();
        Car myCar2 = new Car();




       Car[] cars = new Car[3];
        cars[0] = myCar;
        cars[1] = myCar1;
        cars[2] = myCar2;


        myCar.setKmOdometer(12312);
        myCar.setTypeCar("Mazda");
        myCar.setColor("Red");
        myCar.setSizeEngine(1600);


        myCar1.setKmOdometer(152312);
        myCar1.setTypeCar("Ford");
        myCar1.setColor("Silver");
        myCar1.setSizeEngine(2500);

        myCar2.setKmOdometer(42521);
        myCar2.setTypeCar("Beamer");
        myCar2.setColor("Green");
        myCar2.setSizeEngine(2800);

        for (int i = 0; i < 3; i++) {


            System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                    cars[i].typeCar, cars[i].color, cars[i].sizeEngine, cars[i].kmOdometer
            );
        }

            myCar.drive();
        System.out.println();
        System.out.printf("The %s %s" + "'s" + " " + "odometer now shows %d\n",
             myCar.color, myCar.typeCar, myCar.kmOdometer );

        System.out.println();
        System.out.println(myCar.toString());
        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());





    }


}
