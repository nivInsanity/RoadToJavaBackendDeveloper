import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EvenDigitSumTest {

    private static final Logger log = LoggerFactory.getLogger(EvenDigitSumTest.class);

    @Test
    public void checkForSmallDigitSumTest() {
        int number = 20;
        int result = EvenDigitSum.getEvenDigitSum(number);

        log.info(String.valueOf(result));

        Assert.assertEquals(2, result);
    }

    @Test
    public void checkEvenDigitSumTest() {
        int number = 1244;
        int result = EvenDigitSum.getEvenDigitSum(number);

        log.info(String.valueOf(result));

        Assert.assertEquals(10, result);
    }

    @Test
    public void minusDigitSumTest() {
        int number = -1244;
        int result = EvenDigitSum.getEvenDigitSum(number);

        log.info(String.valueOf(result));

        Assert.assertNotEquals(10, result);
    }


}