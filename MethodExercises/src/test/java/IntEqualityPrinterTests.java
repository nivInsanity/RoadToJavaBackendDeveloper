import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntEqualityPrinterTests {

    private static final Logger log = LoggerFactory.getLogger(IntEqualityPrinterTests.class);

    @Test
    public void allIntsAreEqualTest () {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 2;

        String allNumbersAreEqual = IntEqualityPrinter.printEqual(firstNumber, secondNumber, thirdNumber);

        log.info(allNumbersAreEqual);

        Assert.assertEquals("All numbers are equal", allNumbersAreEqual);
    }

    @Test
    public void allIntsAreDifferentTest () {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        String allNumbersAreEqual = IntEqualityPrinter.printEqual(firstNumber, secondNumber, thirdNumber);

        log.info(allNumbersAreEqual);

        Assert.assertEquals("All numbers are different", allNumbersAreEqual);
    }

    @Test
    public void twoIntsAreDifferentTest () {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 1;

        String allNumbersAreEqual = IntEqualityPrinter.printEqual(firstNumber, secondNumber, thirdNumber);

        log.info(allNumbersAreEqual);

        Assert.assertEquals("Neither all are equal or different", allNumbersAreEqual);
    }

    @Test
    public void negativeIntsAreDifferentTest () {
        int firstNumber = 0;
        int secondNumber = 10;
        int thirdNumber = -40;

        String allNumbersAreEqual = IntEqualityPrinter.printEqual(firstNumber, secondNumber, thirdNumber);

        log.info(allNumbersAreEqual);

        Assert.assertEquals("Invalid Value", allNumbersAreEqual);
    }
}
