import java.util.Scanner;

public class HighLow {
    public static int main(String[] args) {
//        Welcome to the world of game development!
//
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//The specs for the game are:
//
//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
//Hints
//
//Use the random method of the java.lang.Math class to generate a random number.
        System.out.println("I've chosen a number 1-100.. guess what is the lucky number, if you dare...");
        Scanner input = new Scanner(System.in);
        int userGuess = Integer.parseInt(input.nextLine());
        return userGuess < 0 && userGuess > 100 ? userGuess : userGuess;
    }
}
