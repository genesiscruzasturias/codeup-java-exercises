import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//      Copy this code into your main method:
        double pi = 3.14159;
//      Write some Java code that uses the variable pi to output the following:
//      The value of pi is approximately 3.14.
//      Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
        String name = "pi";
        System.out.printf("The value of %s is %s.", name, pi);


//      Explore the Scanner Class.
//      Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//      What happens if you input something that is not an integer?
//        Error Encountered: Exception in thread "main" java.util.InputMismatchException
//	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
//	at java.base/java.util.Scanner.next(Scanner.java:1602)
//	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
//	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
//	at ConsoleExercises.main(ConsoleExercises.java:19)
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter an integer: ");
//        int userInput = scanner.nextInt();

//     Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//     What happens if you enter less than 3 words?
//     What happens if you enter more than 3 words?
//        If you enter less than 3 words, it will let you keep typing.
//        If you try to enter more than 3 words, it won't let you type anymore and will finish running.
//        System.out.print("Please enter 3 words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();

//    Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.println("Enter any sentence that comes to mind: ");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);
//do you capture all the words?
//        Yes, all words are captured.
//        CODEUP PERIMETER
//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//      Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//      Assume that the rooms are perfect rectangles.
//      Assume that the user will enter valid numeric data for length and width.
        System.out.println("Enter values of length Fenrir classroom at Codeup: ");
        System.out.println("Enter values of width Fenrir classroom at Codeup: ");
        String userLength = scanner.nextLine();
        String userWidth = scanner.nextLine();
        System.out.println("The length is: " + Integer.parseInt(userLength));
        System.out.println("The width is: " + Integer.parseInt(userWidth));

//        Display the area and perimeter of that classroom.
        System.out.println("The perimeter of this classroom is: " + ((Integer.parseInt(userLength) * 2) + (Integer.parseInt(userWidth) * 2)));
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        System.out.println("The area of this classroom is: " + (Integer.parseInt(userLength)) * (Integer.parseInt(userWidth)));
    }
}
