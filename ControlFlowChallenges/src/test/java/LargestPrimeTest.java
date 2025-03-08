import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LargestPrimeTest {

    private static final Logger log = LoggerFactory.getLogger(LargestPrimeTest.class);

    @Test
    public void findLargestPrimeTest() {
        int number = 21;
        int findResult = LargestPrime.getLargestPrime(number);

        log.info("Largest prime of {} is {}", number, findResult);

        Assert.assertEquals(7, findResult);
    }

    @Test
    public void minusValueTest() {
        int number = -45;
        int findResult = LargestPrime.getLargestPrime(number);

        log.info("With minus value result is {}", findResult);

        Assert.assertNotEquals(5, findResult);
    }



}