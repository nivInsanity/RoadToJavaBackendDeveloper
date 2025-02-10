import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstLastDigitSumTest {

    private static final Logger log = LoggerFactory.getLogger(FirstLastDigitSumTest.class);

    @Test
    public void sumFirstAndLastTest() {
        int number = 12451;
        int resultNumber = FirstLastDigitSum.sumFirstAndLastDigit(number);

        log.info(String.valueOf(resultNumber));

        Assert.assertEquals(2, resultNumber);
    }

    @Test
    public void negativeSumTest() {
        int number = -89162;
        int resultNumber = FirstLastDigitSum.sumFirstAndLastDigit(number);

        log.info(String.valueOf(resultNumber));

        Assert.assertNotEquals(10, resultNumber);
    }

    @Test
    public void negativeSmallSumTest() {
        int number = 10;
        int resultNumber = FirstLastDigitSum.sumFirstAndLastDigit(number);

        log.info(String.valueOf(resultNumber));

        Assert.assertEquals(1, resultNumber);
    }

}