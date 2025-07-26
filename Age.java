import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Age {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Ask the user for their birth year, month, and day


        System.out.print("Enter your birth year (e.g. 2000): ");

        int year = input.nextInt();


        System.out.print("Enter your birth month (1-12): ");


        int month = input.nextInt();


        System.out.print("Enter your birth day (1-31): ");

        int day = input.nextInt();


        // Create birthdate


        LocalDate birthDate = LocalDate.of(year, month, day);


        // Get today's date

        LocalDate today = LocalDate.now();


        // Calculate the age

        Period age = Period.between(birthDate, today);


        // Show the age

        System.out.println("You age is " + age.getYears() + " years, " + age.getMonths() + " months and " + age.getDays() + " days" );



        input.close();
    }
}
