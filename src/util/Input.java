package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

//    The class should have the following methods, all of which return command line input from the user:
//    String getString()

    public String getString(){
        System.out.println("enter a string");
        return scanner.nextLine();
    };
//    boolean yesNo()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

    public boolean yesNo(){
        System.out.println("Y/N?");

        String input = scanner.nextLine().trim();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");

    };

//    int getInt(int min, int max)
//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.

    public int getInt(int min, int max){

        System.out.println("enter an integer between " + min + " and " + max);
        int input;
        boolean isInt = false;

        do {
            input = Integer.parseInt(scanner.nextLine());

            if (input > min && input < max) {
                isInt = true;
            } else {
                System.out.println("Invalid, enter an integer between " + min + " and " + max);
            }
        } while (!isInt);

        return input;
    };

//    int getInt()

    public int getInt(){
        System.out.println("enter an integer");

        int input = Integer.parseInt(scanner.nextLine());
        return input;

    };

//    double getDouble(double min, double max)
// The getDouble method should do the same thing, but with decimal numbers.

    public double getDouble(double min, double max){

        System.out.println("enter a double between " + min + " and " + max);
        double input;
        boolean isDouble = false;

        do {
            input = Double.parseDouble(scanner.nextLine());

            if (input > min && input < max) {
                isDouble = true;
            } else {
                System.out.println("Invalid, enter a double between " + min + " and " + max);
            }
        } while (!isDouble);

        return input;
    };

//    double getDouble()

    public double getDouble(){
        System.out.println("enter a double");

        int input = Integer.parseInt(scanner.nextLine());
        return input;

    };

}
