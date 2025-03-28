public class ReverseArrayChallenge {
    public static int[] reverseArray(int[] arrayToReverse) {
        int[] reversedArray = new int[arrayToReverse.length];
        int fromZeroIterator = 0;

        for (int iterator = arrayToReverse.length-1; iterator >= 0; iterator--) {
            reversedArray[fromZeroIterator] = arrayToReverse[iterator];
            fromZeroIterator += 1;
        }

        return reversedArray;
    }

    //faster, but method will change the array instead of creating a copy
    public static int[] reverseArrayInPlace(int[] arrayToReverse) {
        int leftSide = 0;
        int rightSide = arrayToReverse.length - 1;

        while (leftSide < rightSide) {
            int leftValue = arrayToReverse[leftSide];
            arrayToReverse[leftSide] = arrayToReverse[rightSide];
            arrayToReverse[rightSide] = leftValue;

            leftSide++;
            rightSide--;
        }
        return arrayToReverse;
    }
}
