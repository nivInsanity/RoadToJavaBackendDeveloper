import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumOddRangeTest {

    private static final Logger log = LoggerFactory.getLogger(SumOddRangeTest.class);

    @Test
    public void checkForOddTest() {
        int sumOddResult = SumOddRange.sumOdd(1, 100);

        log.info("Result of the sum is: {}", sumOddResult);

        Assert.assertEquals(2500, sumOddResult);
    }

    @Test
    public void startGreaterThanEndTest() {
        int sumOddResult = SumOddRange.sumOdd(10, 5);

        log.info("Start greater than end, resulted value is: {}", sumOddResult);

        Assert.assertNotEquals(100, sumOddResult);
    }

    @Test
    public void bothNegativeTest() {
        int sumOddResult = SumOddRange.sumOdd(-40, -80);

        log.info("Values are negative, resulted value is: {}", sumOddResult);

        Assert.assertEquals(-1, sumOddResult);
    }

    @Test
    public void bothAreEqualTest() {
        int sumOddResult = SumOddRange.sumOdd(1000, 1000);

        log.info("Values are both equal, resulted value is: {}", sumOddResult);

        Assert.assertEquals(0, sumOddResult);
    }

}