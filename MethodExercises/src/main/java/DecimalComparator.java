public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstTruncated = (int) (firstNumber * 1000);
        int secondTruncated = (int) (secondNumber * 1000);

        return firstTruncated == secondTruncated;
    }
}
