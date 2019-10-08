import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        int guess;
        int numOfGuesses = 0;
        int guessesLeft = 10;
        int randNum = (int) (Math.random() * 99) + 1;
        boolean guessed = false;

        guess = getGuess(guessesLeft);

        do {
            numOfGuesses++;
            guessesLeft--;

            if (guess > randNum) {
                if (guessesLeft == 0) {
                    System.out.println("You ran out of guesses");
                    System.out.println("The number was: " + randNum);
                } else {
                    System.out.println("LOWER");
                    System.out.println("Guess again");
                    guess = getGuess(guessesLeft);
                }
            } else if (guess < randNum) {
                if (guessesLeft == 0) {
                    System.out.println("You ran out of guesses");
                    System.out.println("The number was: " + randNum);
                } else {
                    System.out.println("HIGHER");
                    System.out.println("Guess again");
                    guess = getGuess(guessesLeft);
                }
            } else if (guess == randNum) {
                System.out.println("GOOD GUESS");
                System.out.println("It took you " + numOfGuesses + " guesses");
                guessed = true;
            }

        } while (!guessed && guessesLeft != 0);
    }

    public static int getGuess(int guessesLeft) {
        Scanner input = new Scanner(System.in);

        boolean isValid = false;
        int guess;

        do {
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + guessesLeft + " guesses left");
            guess = Integer.parseInt(input.nextLine());

            if (guess > 0 && guess < 100) {
                isValid = true;
            } else {
                System.out.println("Invalid input");
            }
        } while (!isValid);

        return guess;
    }
}