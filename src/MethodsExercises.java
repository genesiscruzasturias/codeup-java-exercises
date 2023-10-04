import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static Scanner localScanner = new Scanner(System.in);

    //        Basic Arithmetic
//
//Create four separate methods. Each will perform an arithmetic operation:
//
//Addition
//Subtraction
//Multiplication
//Division
//Each function needs to take two parameters/arguments so that the operation can be performed.
//
//Test your methods and verify the output.
//
//Add a modulus method that finds the modulus of two numbers.
//
//Food for thought: What happens if we try to divide by zero? What should happen?
//    Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at MethodsExercises.division(MethodsExercises.java:34)
//	at MethodsExercises.main(MethodsExercises.java:22)
    public static void main(String[] args) {

//        System.out.println(addition(50, 90));
//        System.out.println(subtraction(98, 38));
//        System.out.println(multiplication(30, 80));
//        System.out.println(division(2, 70));
//        System.out.println(modulus(56, 3));
//        System.out.println(getInteger(1, 10));
        int n = 0;
        System.out.println(dice(n));

//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//
//The method signature should look like this:
//
//public static int getInteger(int min, int max);
//and is used like this:
//
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
//
//Hint: recursion might be helpful here!
//public static int getInteger(int min, int max){
//        return
//}

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        int userInput = Integer.parseInt(scanner.next()); getInteger(1, 10);
////        userInput = ;
//        int num = 0;
//        int min = 1;
//        int max = 10;
//        System.out.println("Enter any number between 1 and 10.");
        int i, fact = 1;
        int number = scanner.nextInt();//It is the number to calculate factorial
        fact = factor(number);
//        System.out.println("Factorial of "+number+" is: "+fact);
        Scanner input = new Scanner(System.in);
        int numberOfDice = input.nextInt();
    }

    public static int addition(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int subtraction(int numOne, int numTwo) {
        return numTwo - numOne;
    }

    public static int multiplication(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static int division(int numOne, int numTwo) {
        return numTwo / numOne;
    }

    public static int modulus(int numOne, int numTwo) {
        return numOne % numTwo;
    }
//    NEED to finish
//    public static int getInteger(int min, int max) {
//        int i = 0;
//        while (i < 10 && i > 0) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println(min);
//        System.out.println(max);
//        return min;
//    }


    //    Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.
//
//Display the factorial of the number entered by the user.
//
//Ask if the user wants to continue.
//
//Use a for loop to calculate the factorial.
//
//Assume that the user will enter an integer, but verify it’s between 1 and
//
//Use the long type to store the factorial.
//
//Continue only if the user agrees to.
//
//A factorial is a number multiplied by each of the numbers before it.
//
//Factorials are denoted by the exclamation point (n!). Ex:
    public static int factor(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factor(n - 1));
    }

    //Create an application that simulates dice rolling.
//
//Ask the user to enter the number of sides for a pair of dice.
//Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//Use static methods to implement the method(s) that generate the random numbers.
//Use the .random method of the java.lang.Math class to generate random numbers.
    public static int dice(int n) {
        System.out.print("Enter the total number of sides in a pair of dice: ");

        // Reading the number of sides in dice
        int numberOfDice = localScanner.nextInt();
        if (numberOfDice > 36) {
            String incorrect = "Incorrect input. Please enter the number of sides in";
        } else if (numberOfDice == 36) {
            System.out.println("Enter the number \"2\" to roll your dice!");
            int rollDice = localScanner.nextInt();
            Random randomNumber = new Random();
            for (int i = 0; i < rollDice; i++) {
                System.out.print(randomNumber.nextInt(6) + 1);
                System.out.println(" ");

            }
            System.out.println("Would you like to play again? Y\\N");
            Scanner input = new Scanner(System.in);
            String playAgain = input.nextLine();
            String yes = "Y";
            String no = "N";

            if (playAgain.equals(yes)) {
                System.out.println("How many dice you rollin' this time?");
                int diceCount = localScanner.nextInt();
                Random randomNumberTwo = new Random();
                    if (diceCount == 2){
                        for (int i = 0; i < rollDice; i++) {
                            System.out.print(randomNumber.nextInt(6) + 1);
                            System.out.println(" ");

                        }
                    } System.out.println("That's it! Thank you for playing!");
      /* Creating Random class object to generate
      random numbers */
            }
            return numberOfDice;
        }
        return numberOfDice;
    }
}



//    public static String playAgain(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        String playAgain = input.nextLine();
//        String yes = "Y";
//        String no = "N";
//
//        if (playAgain == yes){
//            System.out.println("Let me ask you this.. do you like cheesecake?");
//            Scanner inputTwo = new Scanner(System.in);
//            String cheesecake = input.nextLine();
//            String yes2 = "Y";
//            String no2 = "N";
////            if (cheesecake == yes2){
//
////            }
//        }
//
//        return playAgain;
//    }



