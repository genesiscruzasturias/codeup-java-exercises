import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        While
//          Create an integer variable i with a value of 5.
//          Create a while loop that runs so long as i is less than or equal to 15
//          Each loop iteration, output the current value of i, then increment i by one.
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;

//            Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//            int i = 0;
//            int n = 100;
//
//
//            do {
//            System.out.println(i);
//            i+=2;
//            } while(i < n);

//              Alter your loop to count backwards by 5's from 100 to -10.
//            int i = 100;
//            int n = -10;
//
//
//            do {
//            System.out.println(i);
//            i-=5;
//            } while(i >= n);
//              Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//            int i = 2;
//            int n = 1000000;
//
//
//            do {
//            System.out.println(i);
//            i*=2;
//            } while(i <= n);

//          One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//          Write a program that prints the numbers from 1 to 100.
//          For multiples of three: print “Fizz” instead of the number.
//          For the multiples of five: print “Buzz”.
//          For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for(int i = 0; i <= 100; i += 1) {
////            System.out.println(i);
//
//            if (((i % 3) == 0) && ((i % 5) == 0))
//            {
//                System.out.println("fizzbuzz");
//            } else if ((i % 3) == 0)
//            {
//                System.out.println("fizz");
//            } else if ((i % 5) == 0)
//            {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//        Display a table of powers.

//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer right now, user! ");
        String userInput = scanner.nextLine();
        System.out.println("Would you like to continue?");
        String userInputTwo = scanner.nextLine();
        for (int i = 1; i < Integer.parseInt(userInput); i*=2){
            System.out.println(i + Integer.parseInt(userInput));
        }
//        System.out.println(Integer.parseInt(userInput));
        System.out.println("This displays squared: " + Integer.parseInt(userInput) * 2);
        System.out.println("This is a break for now to not get me confused.");
        System.out.printf("--------------------------------%n");
    }
}

