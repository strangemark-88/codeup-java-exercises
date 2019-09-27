package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        create a variable of the type Rectangle named box1
//        and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.

//        Rectangle box1 = new Rectangle(5,4);

//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());

//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.

//        Rectangle box2 = new Square(5);

//            System.out.println(box2.getPerimeter());
//            System.out.println(box2.getArea());


//        declare a variable of the type Measurable named myShape.
//                Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and circumference.
//
//        Answer the following questions:
//

        Measurable myShape = new Square(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(3, 4);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

//        Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//
//        methods in an implemented class must override the parent interface methods
//
//        What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//
//        myShape variable is a measurable object and does not have those methods




    }

}
