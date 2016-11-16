package day2.Workshop3;

/**
 * Created by gabkamabka on 2016.11.15..
 */
public class Dog extends Animal {


    public Dog () {
        super("Dog");
    }

    public void beg (){
        System.out.println("dog begs");
    }

    public void speak(){
        super.speak("dog barks");
    }

    public void toString2(boolean b, int i) {
        super.toString();
    }
}
