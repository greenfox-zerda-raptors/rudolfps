package day2.Workshop3;

/**
 * Created by gabkamabka on 2016.11.15..
 */
public class Workshop3 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Testing Animal");
        // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore
        animal.speak();
        animal.sleep();
        animal.toString();


        System.out.println();

        System.out.println("\nTesting Bird");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore
       bird.speak();
        bird.sleep();
        bird.move();
        bird.toString();






      System.out.println("\nTesting Dog");
        dog.speak();
        dog.sleep();
        dog.beg();
        dog.toString2(false, 10);




        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?


      //  System.out.println("\nTesting Dog2");

      //  Animal dog2 = new Dog();
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

      //  System.out.println("\nTesting Dog 'd'");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

    }
}
