import java.util.Arrays;
import java.util.Scanner;

public class MinFinderExercise {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array (integer): \n");
        int arraySize = scanner.nextInt();

        return arraySize;
    }

    private static int[] readElements(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] userInputNumbersArray = new int[arraySize];

        for (int number = 0; number < arraySize; number++) {
            System.out.printf("Enter %d number for array: \n", number + 1);
            userInputNumbersArray[number] = scanner.nextInt();
        }
        return userInputNumbersArray;
    }

    private static int findMin(int[] collectionToFindValue) {

        return Arrays.stream(collectionToFindValue)
                .min()
                .orElseThrow();
    }
}
