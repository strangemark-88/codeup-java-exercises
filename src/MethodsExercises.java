public class MethodsExercises {


//    Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
//            Subtraction
//    Multiplication
//            Division
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//    Test your methods and verify the output.
//
//    Add a modulus method that finds the modulus of two numbers.

    public static void main(String[] args) {

//        System.out.println(addition(1,2));
//        System.out.println(subtraction(1,2));
//        System.out.println(multiplication(1,2));
//        System.out.println(division(10,2));
//        System.out.println(modulus(10,2));
//        System.out.println(multiplicationBonus(1,-10));
//        System.out.println(multiplicationRecursion(-1, 10));

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

    }


    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static double multiplicationBonus(double num1, double num2){

        double sum = 0;
        if(num1 > 0 && num2 > 0){
            sum += num2;
            num1--;
        } else if(num1 == 0 || num2 == 0){
            return sum;
        } else if(num1 <0) {
            num1 *= -1;
            sum += num2;
            num1--;
            sum *= -1;
        }
        else{
            num2 *= -1;
            sum += num2;
            num1--;
            sum *= -1;
        }

        return sum;
    }



//    Do the above with recursion.

    public static double multiplicationRecursion(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }else if(num1 > 0 && num2 >0){
            return (num1 + multiplicationRecursion(num1, num2 -1));
        }else if(num1 < 0){
            return -multiplicationRecursion(-num1, num2);
        }else{
            return -multiplicationRecursion(num1, -num2);
        }
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }
    public static double modulus(double num1, double num2){
        return num1 % num2;
    }

/////////////////////////////// Problem 2 ///////////////////////////////

//    public static int getInteger(int min, int max){
//        return 0;
//    }





}

