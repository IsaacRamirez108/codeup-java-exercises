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



    }
}
