package InheritanceLecture;

public class InheritanceTest {

//          3. Create a class InheritanceTest with a main method and experiment with
//            creating Dog objects, Animal objects, and changing the visibility of the various properties.

    public static void main(String[] args) {
        Animal cat = new Animal(5, "feline", true);

        Dog myDog = new Dog(2, "canine", true, "mutt", "Daisy");

        System.out.println(cat.isAlive());
        System.out.println(myDog.getAge());

    }

}
