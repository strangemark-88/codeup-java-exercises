package InheritanceLecture;

public class Animal {
//    1. Make a class Animal that has instance properties for...
//           - age
//           - species
//           - isAlive
//              Include a constructor that sets these properties and getters and setters
//          2. Make a class of Dog that extends from Animal...
//              Include properties for breed and name
//              Include a constructor, getters and setters.
//          3. Create a class InheritanceTest with a main method and experiment with
//            creating Dog objects, Animal objects, and changing the visibility of the various properties.

    private int age;
    private String species;
    private boolean isAlive;

    public Animal(int age, String species, boolean isAlive) {
        this.age = age;
        this.species = species;
        this.isAlive = isAlive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
