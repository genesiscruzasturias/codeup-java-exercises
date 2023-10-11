package shapes;

public class Square extends Rectangle implements Measurable {

    public Square(int side){
        super(side, side);
    }

    public Square() {
        super();
    }
//
//    // method overriding
//    @Override
//    public double getArea() {
//        int side = 0;
//        return 4 * side;
//    }
}
