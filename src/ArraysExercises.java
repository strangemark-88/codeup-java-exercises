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

}
