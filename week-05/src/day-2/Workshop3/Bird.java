package day2.Workshop3;

/**
 * Created by gabkamabka on 2016.11.15..
 */
public class Bird extends Animal {

    public Bird (){
        super("Bird");
    }

    public void speak(){
        super.speak("bird chirps");

    }
    public void move(){
        System.out.println("bird flies");
    }

}
