import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int iterator = 0;
        long average = 0;

        //No unit tests with user input
        while (true) {
            try {
                sumOfNumbers += scanner.nextInt();
                iterator++;
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                break;
            }
        }

        if (iterator > 0) {
            average = Math.round((double) sumOfNumbers / iterator);
        }

        System.out.printf("SUM = %d AVG = %d", sumOfNumbers, average);
    }
}
