public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        int lastDigit;

        if (number < 0) {
            return -1;
        } else {
            lastDigit = number % 10;

            while (number >= 10) {
                number = number / 10;
            }

            number = lastDigit + number;

            return number;
        }
    }
}
