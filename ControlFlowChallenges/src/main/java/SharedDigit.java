public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        int lastDigitFirstNumber, lastDigitSecondNumber, thirdDigit, fourthDigit;

        //TODO: do rozkminki


        lastDigitFirstNumber = firstNumber % 10;
        lastDigitSecondNumber = secondNumber % 10;

        while (firstNumber > 0) {

        }

        thirdDigit = secondNumber % 10;
        fourthDigit = secondNumber / 10;

/*        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        } else return firstDigit == thirdDigit || firstDigit == fourthDigit || secondDigit == thirdDigit || secondDigit == fourthDigit;
    */
        return false;
    }
}
