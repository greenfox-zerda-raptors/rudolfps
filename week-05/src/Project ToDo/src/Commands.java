/**
 * Created by gabkamabka on 2016.11.18..
 */
public class Commands {

    public void menu(){
        System.out.println();  //calls toString()

        System.out.println("CLI ToDo Application");
        System.out.println("==============\n");


        //print menu choices
        System.out.println("Available commands:");
        System.out.println(" " + "list       Lists all the tasks");
        System.out.println(" " + "l          shorthand for list");
        System.out.println(" " + "add        Adds a new task");
        System.out.println(" " + "a          shorthand for a");
        System.out.println(" " + "remove     Removes a task");
        System.out.println(" " + "r          shorthand for remove");
        System.out.println(" " + "complete   Completes a task");
        System.out.println(" " + "c          shorthand for complete");
        System.out.println(" " + "help       Print out this list again");
        System.out.println(" " + "h          shorthand for help\n");

        System.out.println("In order to start the application");
        System.out.println("Please choose one of the methods listed above:");
        String choice = null;

    }
}
