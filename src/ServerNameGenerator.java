import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
//      Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
        String[] stringArrayOne = new String[10];
        stringArrayOne[0]= "Beautiful";
        stringArrayOne[1]= "Cool";
        stringArrayOne[2]= "Messy";
        stringArrayOne[3]= "Awful";
        stringArrayOne[4]= "Bright";
        stringArrayOne[5]= "Gnarly";
        stringArrayOne[6]= "Jolly";
        stringArrayOne[7]= "Fast";
        stringArrayOne[8]= "Happy";
        stringArrayOne[9]= "Tasty";
        String[] stringArrayTwo = new String[10];
        stringArrayTwo[0] = "Girl";
        stringArrayTwo[1] = "Doctor";
        stringArrayTwo[2] = "Woman";
        stringArrayTwo[3] = "Officer";
        stringArrayTwo[4] = "Dog";
        stringArrayTwo[5] = "Cat";
        stringArrayTwo[6] = "Car";
        stringArrayTwo[7] = "Desk";
        stringArrayTwo[8] = "Laptop";
        stringArrayTwo[9] = "Music";
        System.out.println(Arrays.toString(stringArrayTwo));
        System.out.println(Arrays.toString(stringArrayOne));
//      Create a method that will return a random element from an array of strings.
//        StringOne
        Random rand = new Random();
        int res = rand.nextInt(stringArrayOne.length);
        System.out.println("Random adjective: " + stringArrayOne[res]);
//        StringTwo
        Random randTwo = new Random();
        int resTwo = rand.nextInt(stringArrayTwo.length);
        System.out.println("Random noun: " + stringArrayTwo[resTwo]);

//        Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    }

}
