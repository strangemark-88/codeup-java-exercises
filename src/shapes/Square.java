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
    public void setLength(double length) {
        super.length = length;
        super.width = length; // makes sure that its always the same
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
        super.length = width; // makes sure that its always the same
    }

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(super.length, 2);
    }


}
