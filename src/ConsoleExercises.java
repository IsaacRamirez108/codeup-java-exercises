import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately, %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter an integer
         System.out.print("Please Enter Integer: ");
         int userInput = scanner.nextInt();

         System.out.println("The Integer You Entered: --> \"" + userInput + "\" <--");

        // Prompting user to enter 3 words
        System.out.print("Please Enter Three words: ");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        // If I enter to little words, code will not run until I enter 3 words
        // If I enter to many words I will receive an error
        System.out.println("1st Word Entered: --> \"" + wordOne + "\" <--");
        System.out.println("2nd Word Entered: --> \"" + wordTwo + "\" <--");
        System.out.println("3rd Word Entered: --> \"" + wordThree + "\" <--");

    }
}
