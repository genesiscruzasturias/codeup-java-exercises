package util;
import java.util.Scanner;

public class Input {
//    Create an input validation class
//
//Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner.
private Scanner scanner;

//Constructor
public Input(){
    scanner = new Scanner(System.in);
}
// When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
// String getString()
public String getString(String prompt) {
    System.out.print(prompt); // Display the prompt to the user
    return scanner.nextLine(); // Read and return user input as a string
}
public boolean yesNo(String prompt) {
    System.out.print(prompt); // Display the prompt to the user
    String input = scanner.nextLine().toLowerCase(); // Read user input and convert to lowercase
    return input.equals("y") || input.equals("yes"); // Return true if input is 'y' or 'yes', false otherwise
}
public int getInt(String prompt, int min, int max) {
   int userInput;
   do {
       System.out.print(prompt); // Display the prompt to the user
       while (!scanner.hasNextInt()) {
       System.out.println("Invalid input. Please enter an integer.");
       scanner.next(); // Consume the invalid input
       }
       userInput = scanner.nextInt(); // Read user input as an integer
       scanner.nextLine(); // Consume the newline character left by nextInt()

            // Validate if the input is within the specified range
       if (userInput < min || userInput > max) {
       System.out.println("Out of range. Please enter an integer between " + min + " and " + max + ".");
       }
       } while (userInput < min || userInput > max); // Repeat until valid input is provided
        return userInput; // Return the validated input
}
    public double getDouble(String prompt, double min, double max) {
        double userInput;
        do {
            System.out.print(prompt); // Display the prompt to the user
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a decimal number.");
                scanner.next(); // Consume the invalid input
            }
            userInput = scanner.nextDouble(); // Read user input as a double
            scanner.nextLine(); // Consume the newline character left by nextDouble()

            // Validate if the input is within the specified range
            if (userInput < min || userInput > max) {
                System.out.println("Out of range. Please enter a number between " + min + " and " + max + ".");
            }
        } while (userInput < min || userInput > max); // Repeat until valid input is provided
        return userInput; // Return the validated input
    }
//boolean yesNo()
//int getInt(int min, 1int max)
//int getInt()
//double getDouble(double min, double max)
//double getDouble()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//Create another class named InputTest that has a static main method that uses all the methods from the Input class.
}
