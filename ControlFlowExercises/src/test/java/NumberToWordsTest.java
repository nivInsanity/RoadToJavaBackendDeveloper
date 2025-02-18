import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberToWordsTest {
    private static final Logger log = LoggerFactory.getLogger(NumberToWordsTest.class);

    @Test
    public void simpleTranslationTest() {
        int number = 100;
        String translatedNumber = NumberToWords.numberToWords(number);

        log.info("{} in words is: {}", number, translatedNumber);

        Assert.assertEquals("One Zero Zero ", translatedNumber);
    }

    @Test
    public void minusNumberTest() {
        int number = -42;
        String translatedNumber = NumberToWords.numberToWords(number);

        log.info("With minus value result is: {}", translatedNumber);

        Assert.assertNotEquals("Four Zero", translatedNumber);
    }

    @Test
    public void reverseNumberTest() {
        int number = 123;
        int reversedNumber = NumberToWords.reverse(number);

        log.info("Reversed number {} is {}", number, reversedNumber);

        Assert.assertEquals(321, reversedNumber);
    }

    @Test
    public void minusReverseNumberTest() {
        int number = -425;
        int reversedNumber = NumberToWords.reverse(number);

        log.info("With minus value reversed number is {}", reversedNumber);

        Assert.assertNotEquals(524, reversedNumber);
    }

    @Test
    public void digitCounterTest() {
        int number = 100;
        int digitsResult = NumberToWords.getDigitCount(number);

        log.info("Number of digits in {} is {}", number, digitsResult);

        Assert.assertEquals(3, digitsResult);
    }

    @Test
    public void minusDigitCounterTest() {
        int number = -4;
        int digitsResult = NumberToWords.getDigitCount(number);

        log.info("With minus value result is {}", digitsResult);

        Assert.assertNotEquals(1, digitsResult);
    }


}