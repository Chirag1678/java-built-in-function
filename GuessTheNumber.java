// Program to make the computer guess the number you thinking between 1 - 100
import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Think of a number between 1 - 100 and I will guess it");

        int number = randomNumber(1, 100);
        int guessCount = 0;

        int start = 1;
        int end = 100;

        while(true) {
            guessCount++;
            System.out.print("Is the number " + number + " correct? ");
            String feedback = input.nextLine();

            if(feedback.equals("correct")) {
                System.out.println("The number is " + number);
                System.out.println("The computer guessed the number in " + guessCount + " tries");
                break;
            } else if(feedback.equals("greater")) {
                start = number+1;
                number = randomNumber(start, end);
            } else if(feedback.equals("lesser")) {
                end = number-1;
                number = randomNumber(start, end);
            }
        }

        input.close();
    }

    // Method to generate a random number
    public static int randomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(start, end);
    }
}
// Sample Output ->
// Think of a number between 1 - 100 and I will guess it
// Is the number 50 correct? lesser
// Is the number 25 correct? greater
// Is the number 37 correct? greater
// Is the number 44 correct? greater
// Is the number 47 correct? greater
// Is the number 49 correct? greater
// Is the number 50 correct? greater
// Is the number 51 correct? correct

// The number is 51
// The computer guessed the number in 7 tries