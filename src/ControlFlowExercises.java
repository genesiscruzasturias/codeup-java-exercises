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

//        System.out.print("Enter an integer right now, user! ");
//        String userInput = scanner.nextLine();
//        System.out.println("Would you like to continue?");
//        String userInputTwo = scanner.nextLine();
//        System.out.println("------");
//        System.out.println("number");
//        System.out.println("------");
////        This is for the plus one
//        for (int i = 0; i < Integer.parseInt(userInput); i++){
//
//            System.out.println(Integer.parseInt(userInput) + i);
//        }
//        System.out.println("------");
//        System.out.println("squared");
//        System.out.println("------");
//        //        This is for the squared
//        for (int i = 0; i < Integer.parseInt(userInput); i++){
//            int ans = (int) Math.pow(Integer.parseInt(userInput)+i,2);
//            System.out.println(ans);
//        }
//        System.out.println("------");
//        System.out.println("cubed");
//        System.out.println("------");
//        This is for the cubed
//        String userInput = scanner.nextLine();
//        for (int i = 0; i < Integer.parseInt(userInput); i++){
//            int ans = (int) Math.pow(Integer.parseInt(userInput)+i,3);
//            System.out.println(ans);
//        }
//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//
//        Display the corresponding letter grade.
//
//                Prompt the user to continue.
//
//        Assume that the user will enter valid integers for the grades.
//
//        The application should only continue if the user agrees to.
//
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
        System.out.print("Enter a grade, user! ");
        String userInput2 = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(userInput2); i++){
            if (Integer.parseInt(userInput2) <= 100 && Integer.parseInt(userInput2) >= 88) {
                System.out.println("A");
            } else if (Integer.parseInt(userInput2) <= 87 && Integer.parseInt(userInput2) >= 80) {
                System.out.println("B");
            } else if (Integer.parseInt(userInput2) <= 79 && Integer.parseInt(userInput2) >= 67) {
                System.out.println("C");
            } else if (Integer.parseInt(userInput2) <= 66 && Integer.parseInt(userInput2) >= 60) {
                System.out.println("D");
            } else if (Integer.parseInt(userInput2) <= 59 & Integer.parseInt(userInput2) >= 0) {
                System.out.println("F");
            } else {
                System.out.println("idk");
            }
        }
        System.out.println(Integer.parseInt(userInput2));
    }
}

