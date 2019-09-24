public class Person {

    public static void main(String[] args) {

////////// Problem 1

//        Person person01 = new Person("mark");
//        System.out.println(person01.getName());
//        person01.sayHello();
//        person01.setName("not mark");
//        System.out.println(person01.getName());
//        person01.sayHello();

////////// Problem 2

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

////////// Problem 3


    }

    private String name;

    public Person(String name){
        this.name = name;
    }


    // returns the person's name
    public String getName(){
        return this.name;
    };
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    };
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello " + this.name);
    };

}
