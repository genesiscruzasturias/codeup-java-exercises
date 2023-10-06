package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);
        double area = box1.getArea();
        System.out.println("The area of the rectangle is: " + area);
        double perimeter = box1.getPerimeter();
        System.out.println("The perimeter of the rectangle is: " + perimeter);

//      create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//      verify that the getPerimeter and getArea methods return 20 and 25, respectively
        Square squareInstance = new Square(5);
        Rectangle box2 = squareInstance;
        System.out.println("The perimeter of the square is: " + box2.getPerimeter());
//        System.out.println("The area of the square is: " + box2.getArea());

        System.out.println(box2.getArea());
    }
}
