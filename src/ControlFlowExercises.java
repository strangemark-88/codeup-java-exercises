import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //////////////////// While Loop ////////////////////

//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        };

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);
//
//        Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//              i -= 5;
//        }while (i >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000

//        long i = 2;
//        do {
//            System.out.println(i);
//                    i *= i;
//        } while(i <= 1000000);

        //////////////////// For Loop ////////////////////

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }

//        for(int i = 0; i < 100; i += 2){
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }

        //////////////////// Fizz Buzz ////////////////////

//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 1; i <= 100; i++){
//            if((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else{
//                System.out.println(i);
//            }
//        }


        //////////////////// Table ////////////////////

//        Prompt the user to enter an integer.

//        Display a table of squares and cubes from 1 to the value entered.

//        Ask if the user wants to continue.

//        Assume that the user will enter valid data.

//        Only continue if the user agrees to.

        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter an integer:");
//        int userNum = input.nextInt();
//
//        for(int i = 0; i <= userNum; i++){
//            int square = i;
//            int cube = i;
//            System.out.println(i);
//            System.out.println(square *= i);
//            System.out.println(cube *= i * i);
//        }

//        String yesNo = "Y";
//
//
//        while (yesNo.equalsIgnoreCase("y")){
//            System.out.println("Enter an integer:");
//            int answer = Integer.parseInt(input.nextLine());
//            System.out.println("Here is your table");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int counter = 1; counter <= answer; counter++){
//                System.out.println(String.format("%-6d | %-7d | %-6d", counter, (int) Math.pow(counter, 2), (int) Math.pow(counter,3)));
//            }
//            System.out.println("Would you like to test another number Y/N?");
//            yesNo = input.nextLine();
//        }
//        System.out.println("ok");


        //////////////////// Grades ////////////////////


//        do {
//            System.out.println("Enter grade number:");
//        int grade = Integer.parseInt(input.nextLine());
//        String gradeLetter = "";
//        if (grade <= 100 && grade >= 88) {
//            gradeLetter = "A";
//        } else if (grade <= 87 && grade >= 80) {
//            gradeLetter = "B";
//        } else if (grade <= 79 && grade >= 67) {
//            gradeLetter = "C";
//        } else if (grade <= 66 && grade >= 60) {
//            gradeLetter = "D";
//        } else if (grade <= 59 && grade >= 0) {
//            gradeLetter = "F";
//        }
//        System.out.println(gradeLetter);
//            System.out.println("Would you like to check another grade Y/N?");
//    }while(input.nextLine().equalsIgnoreCase("Y"));


    }
}
