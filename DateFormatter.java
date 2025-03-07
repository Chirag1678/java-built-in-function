// Perform operation to format current date in three formats
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormatter {
    public static void main(String[] args) {
        // Design formatter for three different formats
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Display result in different formats
        System.out.println("Current date in dd/MM/yyyy format: " + currentDate.format(formatter1));
        System.out.println("Current date in yyyy-MM-dd format: " + currentDate.format(formatter2));
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + currentDate.format(formatter3));
    }
}
// Sample Output ->
// Current date in dd/MM/yyyy format: 07/03/2025
// Current date in yyyy-MM-dd format: 2025-03-07
// Current date in EEE, MMM dd, yyyy format: Fri, Mar 07, 2025
