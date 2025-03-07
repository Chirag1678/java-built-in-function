// Program to perform arithmetic operations on date
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class ArithmeticOpsOnDate {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take a date input in (dd-mm-yyyy) format
        System.out.print("Enter a date in (dd-mm-yyyy) format: ");
        String date = input.nextLine();

        // Method to format string date into a date object
        LocalDate dateObj = formatDate(date);

        // Method to perform arithmetic operations on date
        LocalDate newDate = additionAndSubtractionOnDate(dateObj);

        // Display the new date in the dd-mm-yyyy format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("New date after arithmetic operations: " + newDate.format(formatter));

        input.close();
    }

    // Method to format a string into a date object
    public static LocalDate formatDate(String date) {
        // Define the date formatter to be used for parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the date string into a LocalDate object using the formatter
        return LocalDate.parse(date, formatter);
        
    }

    // Method to perform arithmetic operations on date
    public static LocalDate additionAndSubtractionOnDate(LocalDate dateObj) {
        // Add 7 days, 1 month and 2 years into the date
        LocalDate newDate = dateObj.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the new date
        newDate = newDate.minusWeeks(3);

        // Return the new date
        return newDate;
    }
}
// Sample Input ->
// Enter a date in (dd-mm-yyyy) format: 07-03-2025
// Sample Output ->
// New date after arithmetic operations: 21-04-2027

// Sample Input ->
// Enter a date in (dd-mm-yyyy) format: 25-12-2021
// Sample Output ->
// New date after arithmetic operations: 15-02-2022