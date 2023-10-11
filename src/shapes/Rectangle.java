package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    public Rectangle() {

    }

//    public Rectangle() {
//        super();
//    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int width() {
        return width;
    }

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//    public double getArea() {
//        return length * width;
//    }
//    public double getPerimeter(){
//        return (length * 2)+(width * 2);
//    }
}
