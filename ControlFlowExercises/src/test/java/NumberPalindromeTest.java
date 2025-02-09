import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberPalindromeTest {

    private static final Logger log = LoggerFactory.getLogger(NumberPalindromeTest.class);

    @Test
    public void palindromeNumberTest() {
        int number = 1221;
        boolean palindromeCheckResult = NumberPalindrome.isPalindrome(number);

        log.info("Is {} a palindrome: {}", number, palindromeCheckResult);

        Assert.assertTrue(palindromeCheckResult);
    }

    @Test
    public void palindromeNegativeNumberTest() {
        int number = -1245421;
        boolean palindromeCheckResult = NumberPalindrome.isPalindrome(number);

        log.info("Is {} a negative palindrome: {}", number, palindromeCheckResult);

        Assert.assertTrue(palindromeCheckResult);
    }

    @Test
    public void zeroNumberTest() {
        int number = 0;
        boolean palindromeCheckResult = NumberPalindrome.isPalindrome(number);

        log.info("Is {} a palindrome number too? - {}", number, palindromeCheckResult);

        Assert.assertTrue(palindromeCheckResult);
    }

    @Test
    public void notNumberTest() {
        int number = 125678;
        boolean palindromeCheckResult = NumberPalindrome.isPalindrome(number);

        log.info("Is {} a palindrome? - {}", number, palindromeCheckResult);

        Assert.assertFalse(palindromeCheckResult);
    }
}