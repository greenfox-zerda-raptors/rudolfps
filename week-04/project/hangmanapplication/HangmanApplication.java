package hangmanapplication;


import java.io.IOException;
import java.util.Scanner;


public class HangmanApplication {


    public static void main(String[] args) throws IOException //for the drawing, if something comes up//
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Well hello, Adventurer! I want to play a game!");
        System.out.println("The device around your neck is called a DeathMask.......");
        System.out.println("No worries, :) you're not kidnapped, and it's not a scene from the movie Saw!");
        System.out.println("It's the world famous Hangman game, the rules are way too simple:");
        System.out.println("You have 6 guesses to name the supahiddenextrasecret word, if you manage to do that, congrats!!!");
        System.out.println("If You fail, the device around yor neck............... :)");

        System.out.println();

        System.out.println("The word is picked, the body is hangin', and desparetly waiting for your help,");
        System.out.println("You start with nothing, and remember, only have six guesses! Every wrong guess is another bodypart on the rope!");
        System.out.println("Be cautious, don't rush, may the luck be with you(and with that poor fella') !");

        // Allows the possibility of multiple games
        boolean doYouWantToPlay = true; // answer required at the bottom
        while (doYouWantToPlay) {
            // Setting up the game
            System.out.println();
            System.out.println("Come on now, let's play!");
            Hangman game = new Hangman();
            do {
                // Drawing
                System.out.println();
                System.out.println(game.drawPicture()); //defines the 0-nth position, and draws it//
                System.out.println();
                System.out.println(game.getFormalCurrentGuess()); //dashes+spaces , the space for the word//
                System.out.print(game.mysteryWord); //prints the word///
                System.out.println();
                
                // Get the guess
                System.out.println("Enter the character, if you're ready:");
                char guess = (sc.next().toLowerCase()).charAt(0); // read the user input as lowercase, only first char!!!
                System.out.println();
                
                // Check if the character is guessed already //function side in Hangman
                while (game.isGuessedAlready(guess)) {
                    System.out.println("AAAA AAAA, Already guessed that before!");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }
                
                // Play the guess   //function side in Hangman
                if (game.playGuess(guess)) {
                    System.out.println("Bullseye! Keep on guessin'"); //valid guess
                } else {
                    System.out.println("Nope, that's not in the word!"); //wrong guess
                }
                
            }
            while (!game.gameOver()); // Keep playing until the game is over
            
            // Play again or no?
            System.out.println();
            System.out.println("Do you really want to play another round?");
            System.out.println("It is hard to get volunteers for hanging! But if you insist, press Y, otherwise it's N.");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');
            
        }
    }
    
}
