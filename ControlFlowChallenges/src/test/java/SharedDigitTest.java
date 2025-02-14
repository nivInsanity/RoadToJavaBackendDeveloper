import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SharedDigitTest {

    private static final Logger log = LoggerFactory.getLogger(SharedDigitTest.class);

    @Test
    public void hasSharedDigitTest() {
        int firstNumber = 10;
        int secondNumber = 11;

        boolean checkForResult = SharedDigit.hasSharedDigit(firstNumber, secondNumber);

        log.info("Has {} and {} shared digit? {}", firstNumber, secondNumber, checkForResult);

        Assert.assertTrue(checkForResult);
    }
    @Test
    public void numberBelowTenTest() {
        int firstNumber = 9;
        int secondNumber = 15;

        boolean checkForResult = SharedDigit.hasSharedDigit(firstNumber, secondNumber);

        log.info("Are given values correct? {}", checkForResult);

        Assert.assertFalse(checkForResult);
    }

    @Test
    public void numbersTooBigTest() {
        int firstNumber = 150;
        int secondNumber = 160;

        boolean checkForResult = SharedDigit.hasSharedDigit(firstNumber, secondNumber);

        log.info("Are too big values correct? {}", checkForResult);

        Assert.assertFalse(checkForResult);
    }

}