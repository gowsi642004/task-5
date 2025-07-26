import java.util.stream.Stream;



public class Uppercase{

    public static void main(String[] args) {

        // create a list of names
        
      Stream < String> names = Stream.of("aBc" , "d", "ef");

      // convert to uppercase by using map method 

      // to print the result - foreach method trigger the processing of the stream

      names.map(name -> name.toUpperCase()).forEach(System.out::println);



    }
}