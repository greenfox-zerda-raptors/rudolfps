package day2;

/**
 * Created by gabkamabka on 2016.11.15..
 */
public class Bird extends Animal {


    public Bird() {
        super("Bird");
    }

    public void fly() {
        System.out.println("The bird can fly");
    }

    public void sleep() {
        System.out.println("The bird is sleeping");
    }

    public void eat() {
        System.out.println("The bird is eating");
    }

    public void nightyNight(){
        super.eat();
        super.sleep();
    }
}