public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609344);
    }

    public static String printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return "Invalid Value";
        }
        else {
            double milesPerHour = toMilesPerHour(kilometersPerHour);

            return String.format("%.2f km/h = %.2f mi/h", kilometersPerHour, milesPerHour);
        }
    }

}