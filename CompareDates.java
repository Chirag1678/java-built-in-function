// Program to compare two date inputs and print the result
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class CompareDates {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first date in dd-mm-yyyy format: ");
        String date1 = input.nextLine();

        System.out.print("Enter the second date in dd-mm-yyyy format: ");
        String date2 = input.nextLine();

        // Format the dates into date object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dateObj1 = LocalDate.parse(date1, formatter);
        LocalDate dateObj2 = LocalDate.parse(date2, formatter);

        // Display the result
        if (isFirstDate(dateObj1, dateObj2)) {
            System.out.println("The first date (" + dateObj1 + ") comes before the second date (" + dateObj2 + ").");
        } else if (isSecondDate(dateObj1, dateObj2)) {
            System.out.println("The first date (" + dateObj1 + ") comes after the second date (" + dateObj2 + ").");
        } else if (areDatesEqual(dateObj1, dateObj2)) {
            System.out.println("Both dates (" + dateObj1 + ") are equal.");
        }

        input.close();
    }

    // Method to check if first date comes before second date
    public static boolean isFirstDate(LocalDate dateObj1, LocalDate dateObj2) {
        return dateObj1.isBefore(dateObj2);
    }

    // Method to check if first date comes after second date
    public static boolean isSecondDate(LocalDate dateObj1, LocalDate dateObj2) {
        return dateObj1.isAfter(dateObj2);
    }

    // Method to check if both dates are equal
    public static boolean areDatesEqual(LocalDate dateObj1, LocalDate dateObj2) {
        return dateObj1.isEqual(dateObj2);
    }
}
// Sample Input ->
// Enter the first date in dd-mm-yyyy format: 07-03-2025
// Enter the second date in dd-mm-yyyy format: 21-04-2027

// Sample Output ->
// The first date (2025-03-07) comes before the second date (2027-04-21).

// Sample Input ->
// Enter the first date in dd-mm-yyyy format: 25-12-2021
// Enter the second date in dd-mm-yyyy format: 15-02-2022

// Sample Output ->
// The first date (2021-12-25) comes before the second date (2022-02-15).