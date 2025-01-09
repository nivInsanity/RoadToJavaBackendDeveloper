public class MinutesToYearsDaysCalculator {

    public static String printYearsAndDays (long minutes) {
        long days = minutes / 1440;
        long years;

        if (minutes < 0) {
            return "Invalid Value";
        } else {
            years = days / 365;
            days = days % 365;

            return String.format("%d min = %d y and %d d", minutes, years, days);
        }
    }
}
