package day2;

/**
 * Created by gabkamabka on 2016.11.15..
 */
public class Workshop1 extends Animal {
    public Workshop1(String type) {
        super(type);
    }

    public static void main(String... args) {
        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.sleep();
        bird.nightyNight();


    }
}
