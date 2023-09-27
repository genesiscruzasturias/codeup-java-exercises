public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.println(" This is me printing my second line, using just print.");

//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 7;
//        System.out.println("My favorite number is " + myFavoriteNumber + ".");

//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "Here is my string for this exercise.";
//        System.out.println(myString);

//        Change your code to assign a character value to myString. What do you notice?
//        myString ='c'
//        Code does not work!

//        Change your code to assign the value 3.14159 to myString. What happens?
//          myString = '3.14159';
//        Doesnt work either!

//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        Error encountered: "variable myNumber might not have been initialized"
//        long myNumber;
//        System.out.println(myNumber);

//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//        Error encountered: "incompatible types: possible lossy conversion from double to long"
//        long myNumber = 3.14;
//        System.out.println(myNumber);

//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println(myNumber);

//        Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.print(myNumber);

//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        Add 'f' at the end OR
//        float myNumber = 3.14f;
//        System.out.println(myNumber);

//        Increments after. If you SO again.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        System.out.println(x);

//        Increments before
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        Try to create a variable named class. What happens?
//        Error encountered: "not a statement"
//        String class = "This is my string class! It is completely redlined.";
//        Error encountered: "Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//	at HelloWorld.main(HelloWorld.java:62)"

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
//        Shorthand(Answer)
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//      Shorthand Operator(answer)
//       System.out.println( x *= y);

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
//        Shorthand Operator(answer)
//        System.out.println(x /= y);
//        System.out.println(y -= x);

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
        int myInt = Integer.MAX_VALUE;
        System.out.println(myInt);
        System.out.println(++myInt);
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//
//[^1]: How many bytes of memory are allocated to store a variable of this data type

    }
}
