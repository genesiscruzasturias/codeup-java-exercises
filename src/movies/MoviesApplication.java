package movies;
import movies.Movie;
import movies.MoviesArray;
import java.util.Scanner;
import java.util.Arrays;


public class MoviesApplication {
    public static void main(String[] args) {

        int exit = 0;
        int allMovies = 1;
        int animatedCategory = 2;
        int dramaCategory = 3;
        int horrorCategory = 4;
        int scifiCategory = 5;

        String exitOut = "exit";
        String viewAll = "view all movies";
        String animated = "view movies in the animated category";
        String drama = "view movies in the drama category";
        String horror = "view movies in the horror category";
        String scifi = "view movies in the scifi category";

        System.out.println(exit + " - " + exitOut);
        System.out.println(allMovies + " - " + viewAll);
        System.out.println(animatedCategory + " - " + animated);
        System.out.println(dramaCategory + " - " + drama);
        System.out.println(horrorCategory + " - " + horror);
        System.out.println(scifiCategory + " - " + scifi);

        Scanner userSelection = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hey!");
        System.out.println("Please select a number from above that best fits your interests!");

        String userInput = userSelection.nextLine();  // Read user input
//        System.out.println("Username is: " + userInput);  // Output user input
        Movie [] obj = MoviesArray.findAll();
        if (Integer.parseInt(userInput) == 0){
            System.out.println("System aborted");
        } else if (Integer.parseInt(userInput) == 1){

            for (Movie x : obj) {
                System.out.println(x.getName());
            }
            System.out.println(Arrays.toString(MoviesArray.findAll()));;
//            Animated
        } else if (Integer.parseInt(userInput) == 2 ) {
            for (Movie x : obj){
                if (x.getCategory().contains("animated")) {
                    System.out.println(x.getName() + " - " + x.getCategory());
                }
            }
            System.out.println("Continue?");
            String userInputTwo = userSelection.nextLine();
            if (userInputTwo.contains("Y") || userInputTwo.contains("y")){
                for (Movie x : obj) {
                    System.out.println(x.getName());
                }
                System.out.println("Keep going?");
                String userInputThree = userSelection.nextLine();
            }else if ((userInputTwo.contains("N") || userInputTwo.contains("n"))) {
                System.out.println("System aborted!");
            }

//            System.out.println(Arrays.toString(MoviesArray.findAll()));
        } else if (Integer.parseInt(userInput) == 3) {
            for (Movie x : obj) {
                if (x.getCategory().contains("drama")){
                    System.out.println(x.getName() + " - " + x.getCategory());
                }
            }
        } else if (Integer.parseInt(userInput) == 4) {
            for (Movie x : obj) {
                if (x.getCategory().contains("horror")){
                    System.out.println(x.getName() + " - " + x.getCategory());
                }
            }
        } else if (Integer.parseInt(userInput) == 5) {
            for (Movie x : obj){
                if (x.getCategory().contains("scifi")){
                    System.out.println(x.getName() + " - " + x.getCategory());
                }
            }
        } else {
            System.out.println("Please select a correct input.");
        }

//        System.out.println(Arrays.toString(MoviesArray.findAll()));
    }
}
