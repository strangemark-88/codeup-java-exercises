import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOExercise {
//    Create a method for retrieving file contents.
//
//    The method should accept a string that is the location of the file,
//    and return a list of strings where each string is a line in the file.

    public static void main(String[] args) {

//        Path Paths.get(String directory, String filename)

        Path fileTest = Paths.get("IO_Test", "testing.txt");

        String filePath = fileTest.toString();

//        System.out.println(filePath);

        getFileContents(filePath);

//        try {
//            getContents(filePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void getFileContents(String str){

        List<String> lines = new ArrayList<>();

        Path p =  Paths.get(str);

        try {
            lines = Files.readAllLines(p);
//            System.out.println(Files.readAllLines(p));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(lines);

//        for (String name : lines) {
//            System.out.println(name);
//        }

    }

//    public static List<String> getContents(String location) throws IOException{
//        Path p = Paths.get(location);
//        return Files.readAllLines(p);
//    }



}
