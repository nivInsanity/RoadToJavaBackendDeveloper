import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LastDigitCheckerTest {

    private static final Logger log = LoggerFactory.getLogger(LastDigitCheckerTest.class);

    @Test
    public void twoLastDigitsSameTest() {
        int firstNumber = 11;
        int secondNumber = 24;
        int thirdNumber = 94;

        boolean resultOfCheck = LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber);

        log.info("Are last digits in {} {} {} the same? {}", firstNumber, secondNumber, thirdNumber, resultOfCheck);

        Assert.assertTrue(resultOfCheck);
    }

    @Test
    public void allDigitsDifferentTest() {
        int firstNumber = 11;
        int secondNumber = 12;
        int thirdNumber = 13;

        boolean resultOfCheck = LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber);

        log.info("Aren't last digits in {} {} {} the same? {}", firstNumber, secondNumber, thirdNumber, resultOfCheck);

        Assert.assertFalse(resultOfCheck);
    }
}