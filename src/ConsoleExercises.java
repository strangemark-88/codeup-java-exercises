import java.util.Scanner;

public class ConsoleExercises {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            //////////////////// Number 1 ////////////////////
            double pi = 3.14159;
            System.out.format("The value of pi is approximately %.2f%n", pi);

            //////////////////// Scanner 1 ////////////////////


//            System.out.println("Enter a number");
//            int userInput = input.nextInt();
//            System.out.println(userInput);

            //////////////////// Scanner 2 ////////////////////


//
//            System.out.println("Enter first word");
//
//            String firstWord = input.next();
//
//            System.out.println("Enter second word");
//            String secondWord = input.next();
//
//            System.out.println("Enter third word");
//            String thirdWord = input.next();
//
//            System.out.println(firstWord);
//            System.out.println(secondWord);
//            System.out.println(thirdWord);

            //////////////////// Scanner 3 ////////////////////


//
//            System.out.println("Enter a sentence");
//            String sentence = input.next();
//            System.out.println(sentence);
//
//            System.out.println("Enter a sentence");
//            String sentence = input.nextLine();
//            System.out.println(sentence);

            //////////////////// Calculate ////////////////////


//
//            System.out.println("Enter the length of the classroom");
//            String length = input.nextLine();
//
//            System.out.println("Enter the width of the classroom");
//            String width = input.nextLine();
//
//
//            int lengthNum = Integer.parseInt(length);
//            int widthNum = Integer.parseInt(width);
//
//            System.out.println("The perimeter of the room is " + ((lengthNum * 2) + (widthNum * 2)));
//            System.out.println("The area of the room is " + ((lengthNum * widthNum)));


            //////////////////// Bonus 1////////////////////

//
//            System.out.println("Enter the length of the classroom");
//            String length = input.nextLine();
//
//            System.out.println("Enter the width of the classroom");
//            String width = input.nextLine();
//
//
//            double lengthNum = Double.parseDouble(length);
//            double widthNum = Double.parseDouble(width);
//
//            System.out.println("The perimeter of the room is " + ((lengthNum * 2) + (widthNum * 2)));
//            System.out.println("The area of the room is " + ((lengthNum * widthNum)));

            //////////////////// Bonus 2////////////////////


            System.out.println("Enter the length of the classroom");
            String length = input.nextLine();

            System.out.println("Enter the width of the classroom");
            String width = input.nextLine();

            System.out.println("Enter the height of the classroom");
            String height = input.nextLine();


            double lengthNum = Double.parseDouble(length);
            double widthNum = Double.parseDouble(width);
            double heightNum = Double.parseDouble(height);

            System.out.println("The perimeter of the room is " + ((lengthNum * 2) + (widthNum * 2)));
            System.out.println("The area of the room is " + ((lengthNum * widthNum)));
            System.out.println("The volume of the room is " + ((lengthNum * widthNum * heightNum)));

        }

}
