import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static int[] readIntegers() {
        System.out.println("Write numbers sequence separated with commas:\n");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String[] inputParts = userInput.split(",");
        int[] inputNumbers = new int[inputParts.length];

        for (int iterator = 0; iterator < inputParts.length; iterator++) {
            inputNumbers[iterator] = Integer.parseInt(inputParts[iterator].trim());
        }
        return inputNumbers;
    }

    public static int findMin(int[] collectionToFindValue) {

        return Arrays.stream(collectionToFindValue)
                             .min()
                             .orElseThrow();
    }
}
