import java.util.Arrays;
import java.util.Scanner;

public class SortArrayExercise {
    public static int[] getIntegers(int arraySize) {
        int[] inputArray = new int[arraySize];
        Scanner scanner = new Scanner(System.in);

        for (int number = 0; number < arraySize; number++) {
            System.out.printf("Write number %d\n", number + 1);
            inputArray[number] = scanner.nextInt();
        }
        return inputArray;
    }

    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.printf("Element %d contents %d\n", i, arrayToPrint[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayToSort) {
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);

        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }
}
