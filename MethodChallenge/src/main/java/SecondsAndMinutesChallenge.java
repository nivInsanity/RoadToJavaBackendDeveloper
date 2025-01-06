public class SecondsAndMinutesChallenge {

    public static String getDurationString (int seconds) {
        int minutes = seconds / 60;

        if (seconds < 0) {
            return "Method got invalid value!";
        } else {
            return getDurationString(seconds, minutes);
        }

    }

    public static String getDurationString (int seconds, int minutes) {
        int hours = 0;

        if (minutes < 0) {
            return "Method got invalid value!";
        } else if (seconds > 59 && seconds < 3600) {
            minutes = seconds / 60;
            seconds = seconds % 60;
        } else {
            hours = (minutes * 60 + seconds) / 3600;
            minutes = minutes % 60;
            seconds = (minutes % 60) + seconds;
        }
        return String.format("%dh%dm%ds", hours, minutes, seconds);
    }
}
