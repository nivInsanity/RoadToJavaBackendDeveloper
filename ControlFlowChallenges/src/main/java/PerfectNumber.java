public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int dividerChecker = 0;
        int divider = 1;

        if (number < 1) {
            return false;
        }

        while (divider < number) {
            if (number % divider == 0) {
                dividerChecker+=divider;
                divider++;
            } else {
                divider++;
            }
        }

        return dividerChecker == number;
    }
}
