package shapes;

public class Square extends Rectangle{


    public Square(int side) {
        super(side, side);
    }


    public int getPerimeter() {
        return 4 * this.length;

    }

    public int getArea() {
        return this.length * this.length;
    }

}
