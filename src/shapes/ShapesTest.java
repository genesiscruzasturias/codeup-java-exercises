package shapes;

public class ShapesTest {
    public static void main(String[] args) {



        Measurable myShape;
        myShape = new Rectangle(5, 4);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(5);


        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

//      create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//      verify that the getPerimeter and getArea methods return 20 and 25, respectively
//        Rectangle box1 = new Rectangle(4, 5);
//        Rectangle box2 = new Square(5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
