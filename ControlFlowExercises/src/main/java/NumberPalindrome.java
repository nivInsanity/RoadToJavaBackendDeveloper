public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;

        if (number < 0) {
            number = number * (-1);
        }

        int originalNumber = number;

        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }

        return reverse == originalNumber;
     }
}
