package shapes;

public class Square extends Rectangle {
    public Square(int side){
        super(side, side);
    }

    // method overriding
    @Override
    public double getArea() {
        int side = 0;
        return 4 * side;
    }
}
