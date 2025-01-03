package main;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = Math.floor(firstNumber * 1000) / 1000;
        secondNumber =  Math.floor(secondNumber * 1000) / 1000;

        return firstNumber == secondNumber;

    }

}
