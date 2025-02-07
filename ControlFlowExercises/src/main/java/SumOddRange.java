public class SumOddRange {
    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        } else return number % 2 != 0;
    }
    public static int sumOdd (int start, int end) {
        int sumOfOdds = 0;

        if (start < 0 || end < 0) {
            return -1;
        } else if (start > end) {
            return -1;
        } else {
                for (int counter = start; counter <= end; counter++) {
                    if (isOdd(counter)) {
                        sumOfOdds += counter;
                    }
                }
                return sumOfOdds;
            }
        }
    }

