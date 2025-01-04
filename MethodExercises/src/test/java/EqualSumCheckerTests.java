import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EqualSumCheckerTests {

    private static final Logger log = LoggerFactory.getLogger(EqualSumCheckerTests.class);

    @Test
    public void compareEqualSumTest () {
        int firstNumber = 1;
        int secondNumber = -2;
        int thirdNumber = -1;

        boolean sumCheckResult = EqualSumChecker.hasEqualSum(firstNumber, secondNumber, thirdNumber);

        log.info(String.valueOf(sumCheckResult));

        Assert.assertTrue(sumCheckResult);
    }

    @Test
    public void compareNegativeEqualSumTest () {
        int firstNumber = 5;
        int secondNumber = 400;
        int thirdNumber = 2919;

        boolean sumCheckResult = EqualSumChecker.hasEqualSum(firstNumber, secondNumber, thirdNumber);

        log.info(String.valueOf(sumCheckResult));

        Assert.assertFalse(sumCheckResult);
    }
}
