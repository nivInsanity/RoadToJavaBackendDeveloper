public class OldNatoAlphabetTranslator {
    public static String translateLetterToWord (char letter) {
        String translatedWord;

        return switch (letter) {
            case 'A' -> translatedWord = "Able";
            case 'B' -> translatedWord = "Baker";
            case 'C' -> translatedWord = "Charlie";
            case 'D' -> translatedWord = "Dog";
            case 'E' -> translatedWord = "Easy";
            case 'F' -> translatedWord = "Fox";
            case 'G' -> translatedWord = "George";
            case 'H' -> translatedWord = "How";
            case 'I' -> translatedWord = "Item";
            case 'J' -> translatedWord = "Jig";
            case 'K' -> translatedWord = "King";
            case 'L' -> translatedWord = "Long";
            case 'M' -> translatedWord = "Mike";
            case 'N' -> translatedWord = "Nan";
            case 'O' -> translatedWord = "Oboe";
            case 'P' -> translatedWord = "Peter";
            case 'Q' -> translatedWord = "Queen";
            case 'R' -> translatedWord = "Roger";
            case 'S' -> translatedWord = "Sugar";
            case 'T' -> translatedWord = "Tare";
            case 'U' -> translatedWord = "Uncle";
            case 'V' -> translatedWord = "Victor";
            case 'W' -> translatedWord = "William";
            case 'X' -> translatedWord = "X-ray";
            case 'Y' -> translatedWord = "Yoke";
            case 'Z' -> translatedWord = "Zebra";
            default -> translatedWord = ("Not found");
        };
    }
}
