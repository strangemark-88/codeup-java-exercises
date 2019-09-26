import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("mark"), new Person("bob"), new Person("jason")};

        for(Person person : people){
            System.out.println(person.getName());
        }

    }

//    Create a static method named addPerson.

//    It should accept an array of Person objects, as well as a single person object to add to the passed array.

//    It should return an array whose length is 1 greater than the passed array,
//    with the passed person object at the end of the array.


    public static Person[] addPerson(Person[] people, Person newPerson){

        Person[] newArr = Arrays.copyOf(people, people.length + 1);

        newArr[newArr.length - 1] = newPerson;

        return newArr;
    }

}
