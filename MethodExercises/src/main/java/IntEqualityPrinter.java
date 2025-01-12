public class IntEqualityPrinter {
    public static String printEqual (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
            return "Invalid Value";
        } else if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return "All numbers are equal";
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            return "All numbers are different";
        } else {
            return "Neither all are equal or different";
        }
    }
}
