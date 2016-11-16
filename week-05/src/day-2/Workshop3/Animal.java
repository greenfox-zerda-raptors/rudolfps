package day2.Workshop3;

/**
 * Created by gabkamabka on 2016.11.15..
 */
public class Animal {
    int lifeExpectancy;
    boolean isCarnivore;


public Animal(){
    System.out.println("Created an animal");
    lifeExpectancy = 10;
    isCarnivore = false;
}
    public Animal(String type) {

        System.out.println("New" + " " + type);

    }

   // public void toString2(boolean type, int i ){
     //   System.out.println("isCarnivore="+ type+" " + ",lifeExpectancy="+ i);


    public String toString(){
        System.out.println("isCarnivore="+ isCarnivore +" " + ",lifeExpectancy="+ lifeExpectancy);
        return null;
        }

    public void speak() {
        System.out.println("Animal speaks");

    }
    public void speak(String type){
        System.out.println(type);
    }


    public void sleep() {
        System.out.println("Animal sleeps");
    }

}
