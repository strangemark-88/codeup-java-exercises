import java.util.Random;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

    public static String[] adjectives = {"Bitter", "Bland", "Fruity", "Minty", "Pickled", "Sour", "Sweet", "Sassy", "Salty", "Spicy"};

    public static String[] nouns = {"gaggle", "village", "colony", "cat", "dog", "violin", "economics", "keyboard", "weather", "duck"};

//    Create a method that will return a random element from an array of strings.

    public static String randomElement(String[] arr){
        Random randWord = new Random();
        return arr[randWord.nextInt(arr.length)];

    }

//    Add a main method, and inside of your main method select and random noun and adjective and
//    hyphenate the combination and display the generated name to the user.

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

    }

}
