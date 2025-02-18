import java.util.InputMismatchException;
import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void MinAndMax() {
        Scanner scanner = new Scanner(System.in);

        //No unit tests with user input
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean checkForInput = false;

        while (true) {
            try {
                System.out.printf("Enter number to check min and max values or any character to quit: \n%n");
                int inputNumber = scanner.nextInt();

                if (inputNumber < min) min = inputNumber;
                if (inputNumber > max) max = inputNumber;

                checkForInput = true;

            } catch (InputMismatchException exception) {
                scanner.nextLine();
                break;
            }
        }
        if (!checkForInput) {
            System.out.println("No values given.");
        } else {
            System.out.printf("Min and max values are: \nmin= %d, \nmax= %d", min, max);
        }
    }
}
