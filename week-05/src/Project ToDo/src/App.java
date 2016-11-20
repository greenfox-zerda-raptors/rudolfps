import com.sun.corba.se.impl.orb.ParserTable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by gabkamabka on 2016.11.17..
 */
public class App {

    public static void main(String[] args) {

        Scanner keybd = new java.util.Scanner(System.in);
        App list = new App();

        ToDoList tasklist = new ToDoList();
        tasklist.tasks.add(0, "Walk the dog");
        tasklist.tasks.add(1, "Buy milk");
        tasklist.tasks.add(2, "Do homework");
        tasklist.tasks.add(3, "Run, run and run");
        tasklist.tasks.add(4, "Push the day's work to Github");
        tasklist.tasks.add(5, "Run, run and run again");
        tasklist.completed.add(0, "do the ToDo app for Demo 11/18");


        //print list
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

        boolean runningTheApp = true;
        while (runningTheApp) {
            //process user's menu choice
            try {
                choice = keybd.next();
                keybd.nextLine();  //clear input stream
                switch (choice) {
                    case "list":      ///////to demo
                    case "l":
                        for (Object temp : tasklist.tasks) {
                            System.out.println(temp);
                        }
                        System.out.println("Type another method or q to quit");
                        break;

                    case "add":
                    case "a":  //ADD
                        System.out.print("Enter the task you need to add: ");
                        String task = keybd.nextLine();
                        tasklist.tasks.add(task);
                        if (task != null) {
                            System.out.println("Added task: " + task);
                        }
                        break;

                    case "remove":
                    case "r":  //REMOVE LAST
                        System.out.print("Enter the task you need to remove ");
                        String rem = keybd.nextLine();
                        tasklist.tasks.remove(rem);
                        if (rem != null) {
                            System.out.println("Removed: " + rem);
                        } else {
                            System.out.println("The to-do list is already empty.");
                        }
                        break;

                    case "complete":
                    case "c":  //REMOVE AT
                        System.out.print("Enter the index of the item to complete: ");
                        String index = keybd.nextLine();
                        tasklist.completed.add(index);
                        tasklist.tasks.remove(index);
                        System.out.println("Removed: " + index);
                        if (index != null) {
                            System.out.println(index + " " + "Moved to completed tasks ");
                        }
                        break;
                    case "help":
                    case "h":
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

                        break;

                    default:
                        System.out.println("Sorry, but " + choice + " is not one of " +
                                "the menu choices. Please try again.");
                        break;
                }
            } catch (java.util.InputMismatchException ime) {


                BufferedWriter bw = null;
                try {
                    bw = new BufferedWriter(new FileWriter("toDoList.txt"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bw.write("This line is written to the file.");
                    bw.newLine();
                    // close up and flush
                    bw.flush();
                    bw.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }//end main

        }

    }
}