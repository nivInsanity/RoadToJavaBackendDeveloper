import java.util.Arrays;

public class ArrayReverseExercise {
    public static String reverse(int[] arrayToReverse) {
        int leftSide = 0;
        int rightSide = arrayToReverse.length - 1;

        while (leftSide < rightSide) {
            int leftValue = arrayToReverse[leftSide];
            arrayToReverse[leftSide] = arrayToReverse[rightSide];
            arrayToReverse[rightSide] = leftValue;

            leftSide++;
            rightSide--;
        }

        return Arrays.toString(arrayToReverse);
    }
}
