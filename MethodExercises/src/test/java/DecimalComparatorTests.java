import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecimalComparatorTests {

    private static final Logger log = LoggerFactory.getLogger(DecimalComparatorTests.class);

    @Test
    public void simpleCompareTest () {
        double firstNumber = -3.1756;
        double secondNumber = -3.175;

        boolean compareNumber = DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber);

        log.info(String.valueOf(compareNumber));

        Assert.assertTrue(compareNumber);
    }

    @Test
    public void compareNegativeTest () {
        double firstNumber = 3.176;
        double negativeNumber = 3.175;

        boolean compareNumber = DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, negativeNumber);

        log.info(String.valueOf(compareNumber));

        Assert.assertFalse(compareNumber);
    }

}
