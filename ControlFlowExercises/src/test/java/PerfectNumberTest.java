import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerfectNumberTest {

    private static final Logger log = LoggerFactory.getLogger(PerfectNumberTest.class);

    @Test
    public void checkForPerfectNumberTest() {
        int perfectNumber = 6;
        boolean result = PerfectNumber.isPerfectNumber(perfectNumber);

        log.info("Is {} a perfect number? {}", perfectNumber, result);

        Assert.assertTrue(result);
    }

    @Test
    public void checkForNotPerfectNumberTest() {
        int perfectNumber = 5;
        boolean result = PerfectNumber.isPerfectNumber(perfectNumber);

        log.info("{} is not a perfect number? {}", perfectNumber, result);

        Assert.assertFalse(result);
    }

    @Test
    public void checkForMinusNumberTest() {
        int perfectNumber = -10;
        boolean result = PerfectNumber.isPerfectNumber(perfectNumber);

        log.info("Below 1 result is {}", result);

        Assert.assertFalse(result);
    }

}