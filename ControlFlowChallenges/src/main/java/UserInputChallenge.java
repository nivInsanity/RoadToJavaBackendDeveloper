import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputChallenge {
    public static void printSumOfFiveInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int iterator = 1;

        //No unit tests with user input
        do {
            try {
                System.out.printf("Enter number: %d\n%n", iterator);
                sumOfNumbers += scanner.nextInt();
                iterator++;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid number");
                scanner.nextLine();
            }

        } while (iterator <= 5);

        System.out.println(sumOfNumbers);
    }
}
