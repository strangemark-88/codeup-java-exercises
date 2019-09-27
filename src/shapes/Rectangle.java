package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    };
//
//    public double getPerimeter(){
//        return (this.length * 2) + (this.width * 2);
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }


    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * super.length) + (2 * super.width);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }

}
