public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValid(firstNumber) || isValid(secondNumber) || isValid(thirdNumber)) {
            return false;
        }

        int firstNumLastDigit = firstNumber % 10;
        int secondNumLastDigit = secondNumber % 10;
        int thirdNumLastDigit = thirdNumber % 10;

        return firstNumLastDigit == secondNumLastDigit ||
                      firstNumLastDigit == thirdNumLastDigit ||
                      secondNumLastDigit == thirdNumLastDigit;
    }

    public static boolean isValid(int number) {
        return number < 10 || number > 1000;
    }
}
