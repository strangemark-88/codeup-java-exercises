import java.util.Scanner;

public class Bob {

//    Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)

//    He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)

//    He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)

//    He answers 'Whatever.' to anything else.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Talk to Bob:");
        String message = input.nextLine();

        if(message.lastIndexOf("?") != -1){
            System.out.println("Sure.");
        } else if(message.lastIndexOf("!") != -1){
            System.out.println("Woah, chill out!");
        } else if(message.equalsIgnoreCase("")){
            System.out.println("Fine. Be that way!");
        } else{
            System.out.println("Whatever");
        }
    }
}
