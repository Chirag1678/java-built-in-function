// Program to check if a given number is prime
import java.util.Scanner;

class PrimeChecker {
    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Method to check if a given number is prime
        boolean isPrime = isPrime(number);

        // Display result
        if(isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        input.close();
    }

    // Method to check if a given number is prime
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }

        // loop from 2 to square root of number
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
// Sample Input ->
// Enter a number: 7

// Sample Output ->
// 7 is a prime number

// Sample Input ->
// Enter a number: 10

// Sample Output ->
// 10 is not a prime number