public class NumberToWords {
    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";

        String translatedNumber;
        StringBuilder concatenatedWords = new StringBuilder();
        int digit, numberLength, reversedNumberLength = 0;

        numberLength = getDigitCount(number);
        number = reverse(number);

        while (number > 0) {
                digit = number % 10;
                switch (digit) {
                    case 0 -> translatedNumber = "Zero";
                    case 1 -> translatedNumber = "One";
                    case 2 -> translatedNumber = "Two";
                    case 3 -> translatedNumber = "Three";
                    case 4 -> translatedNumber = "Four";
                    case 5 -> translatedNumber = "Five";
                    case 6 -> translatedNumber = "Six";
                    case 7 -> translatedNumber = "Seven";
                    case 8 -> translatedNumber = "Eight";
                    case 9 -> translatedNumber = "Nine";
                    default -> translatedNumber = "Not found.";
                }
                concatenatedWords.append(translatedNumber).append(" ");
                number = number / 10;
                reversedNumberLength++;
            }

        while (reversedNumberLength < numberLength) {
            concatenatedWords.append("Zero").append(" ");
            reversedNumberLength++;
        }

        return concatenatedWords.toString();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
       if (number < 0) {
           return -1;
       }

       return String.valueOf(number).length();
    }
}
