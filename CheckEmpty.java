import java.util.Arrays;
import java.util.List;

public class CheckEmpty {
    
    public static void main(String[] args) {
        
        List < String > Liststrings = Arrays.asList("abc" , "" , "bc" , "efg" , "abcd" , "" , "jkl");

        // Check if any string in the list is empty or not

        boolean empty = Liststrings.stream().anyMatch(Stringletter -> Stringletter.isEmpty());

           System.out.println(empty);

            // print all non-empty strings in the list

          List < String > emptyList =  Liststrings.stream().filter(letters-> !letters.isBlank()).toList();

         System.out.println(emptyList);
              

       
    }
}
