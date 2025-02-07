public class DigitSum {
    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
        }
        return sum;
    }
}
