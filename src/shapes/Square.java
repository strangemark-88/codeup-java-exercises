package shapes;

public class Square extends Quadrilateral{


//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("square over-ride");
//        return 4 * super.length;
//
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("square over-ride");
//        return Math.pow(super.length, 2);
//    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);

    }

    @Override
    public double getArea() {
        return length * width;
    }


}
