import java.util.Arrays;
import java.util.List;

public class Student {
 
    public static void main(String[] args) {

        // use list interface to store the student's name
        

        List < String > names = Arrays.asList("abi", "balu"," charu", "dinesh", "easwaran", "fathima", "gokul", "arun", "ashwin", "bala");


        // filter the students whose name starts with "A" by using filter method and lambda expression

        List < String > specialStudents = names.stream().filter(name -> name.startsWith("a")).toList();

      // also i filter the students whose name did not starts with " A "

       List < String > otherStudents = names.stream().filter (name -> !name.startsWith("a")).toList();

       
        System.out.println(specialStudents);

        System.out.println(otherStudents);
    }
 }