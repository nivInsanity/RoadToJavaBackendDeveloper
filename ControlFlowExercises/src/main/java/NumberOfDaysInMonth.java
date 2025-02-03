public class NumberOfDaysInMonth {
    //It's not your imagination - just reused code from other exercise (half of the task was the same)
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {

        boolean checkForLeapYear = isLeapYear(year);

        if (year < 1 || year > 9999) {
            return -1;
        } else {
            return switch (month) {
                case 1 -> 31;
                case 2 -> checkForLeapYear ? 29 : 28;
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> -1;
            };
        }

    }
}