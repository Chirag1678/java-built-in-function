// Program to generate the fibonacci sequence
import java.util.Scanner;

class FibonacciSequenceGenerator {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        // Method to generate the fibonacci sequence and display
        generateFibonacci(terms);

        input.close();
    }

    // Method to generate the fibonacci sequence and display
    public static void generateFibonacci(int terms) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Sequence: " + num1 + " " + num2);

        for(int i = 2; i < terms; i++) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
// Sample Input ->
// Enter the number of terms: 10

// Sample Output ->
// Fibonacci Sequence: 0 1 1 2 3 5 8 13 21 34

// Sample Input ->
// Enter the number of terms: 15

// Sample Output ->
// Fibonacci Sequence: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377