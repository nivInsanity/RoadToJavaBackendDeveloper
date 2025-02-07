import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DigitSumTest {

    private static final Logger log = LoggerFactory.getLogger(DigitSumTest.class);

    @Test
    public void sumDigitsTest() {
        int sumOfDigits = DigitSum.sumDigits(125);

        log.info("Sum of digits = {}", sumOfDigits);

        Assert.assertEquals(8, sumOfDigits);
    }

    @Test
    public void negativeDigitsTest() {
        int sumOfDigits = DigitSum.sumDigits(-4282);

        log.info("Negative value given = {}", sumOfDigits);

        Assert.assertNotEquals(-16, sumOfDigits);
    }

    @Test
    public void oneDigitTest() {
        int sumOfDigits = DigitSum.sumDigits(1);

        log.info("Negative value given = {}", sumOfDigits);

        Assert.assertEquals(1, sumOfDigits);
    }

}