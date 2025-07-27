import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Age {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Ask the user for their birth year, month, and day


        System.out.print("Enter your birthdate (yyyy-MM-dd): ");

         String input = scanner.nextLine();

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Create birthdate

        LocalDate birthDate = LocalDate.parse(input, formatter);


        // Get today's date

        LocalDate today = LocalDate.now();


        // Calculate the age

        Period age = Period.between(birthDate, today);


        // Show the age

        System.out.println("your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");



        scanner.close();
    }
}
