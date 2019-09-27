package InheritanceLecture;

public class Dog extends Animal {

    //2. Make a class of Dog that extends from Animal...
    //              Include properties for breed and name
    //              Include a constructor, getters and setters.

   private String breed;
   private String name;

    public Dog(int age, String species, boolean isAlive, String breed, String name) {
        super(age, "canine", isAlive);
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
