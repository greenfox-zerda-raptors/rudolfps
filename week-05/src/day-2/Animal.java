package day2;

/**
 * Created by gabkamabka on 2016.11.15..
 */
public class Animal {

    public Animal() {

        System.out.println("Created an animal");
    }
    public Animal(String type) {
        this();
        System.out.println(type + " " + "animal is created");
    }
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

}
