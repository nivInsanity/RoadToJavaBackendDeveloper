public class MegaBytesConverter {
    public static String printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            return ("Invalid Value");
        } else {

            int megaBytes = kiloBytes / 1024;
            int remainingkiloBytes = kiloBytes % 1024;

            return String.format("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainingkiloBytes);
        }
    }
}