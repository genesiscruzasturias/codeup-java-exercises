import java.util.Arrays;

public class ArraysExercises extends Person {
    private String name;
    private int age;

    public ArraysExercises(String name) {
        super(name);
    }

//    public static void addPerson();

    public static void main(String[] args) {
        ;
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] obj = new Person[3];
        String[] people = {"Genesis", "Martha", "Azariah"};

        for (String person : people) {
            System.out.println(person);
        }

    }
}
