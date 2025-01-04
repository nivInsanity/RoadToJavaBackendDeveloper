import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeenNumberCheckerTests {

    private static final Logger log = LoggerFactory.getLogger(TeenNumberCheckerTests.class);

    @Test
    public void oneParamCorrectTest () {
        int firstParam = 5;
        int secondParam = 15;
        int thirdParam = 50;

        boolean CheckTeenFromParams = TeenNumberChecker.hasTeen(firstParam, secondParam, thirdParam);
        boolean CheckTeenFromParam = TeenNumberChecker.isTeen(secondParam);

        log.info(String.valueOf(CheckTeenFromParams));
        log.info(String.valueOf(CheckTeenFromParam));

        Assert.assertTrue(CheckTeenFromParams);
        Assert.assertTrue(CheckTeenFromParam);
    }

    @Test
    public void twoParamsCorrectTest () {
        int firstParam = 18;
        int secondParam = 15;
        int thirdParam = 50;

        boolean CheckTeenFromParams = TeenNumberChecker.hasTeen(firstParam, secondParam, thirdParam);
        boolean CheckTeenFromParam = TeenNumberChecker.isTeen(secondParam);

        log.info(String.valueOf(CheckTeenFromParams));
        log.info(String.valueOf(CheckTeenFromParam));

        Assert.assertTrue(CheckTeenFromParams);
        Assert.assertTrue(CheckTeenFromParam);
    }

    @Test
    public void allParamsCorrectTest () {
        int firstParam = 13;
        int secondParam = 14;
        int thirdParam = 19;

        boolean CheckTeenFromParams = TeenNumberChecker.hasTeen(firstParam, secondParam, thirdParam);
        boolean CheckTeenFromParam = TeenNumberChecker.isTeen(secondParam);

        log.info(String.valueOf(CheckTeenFromParams));
        log.info(String.valueOf(CheckTeenFromParam));

        Assert.assertTrue(CheckTeenFromParams);
        Assert.assertTrue(CheckTeenFromParam);
    }
    @Test
    public void allParamsWrongTest () {
        int firstParam = 9;
        int secondParam = 5;
        int thirdParam = -94;

        boolean CheckTeenFromParams = TeenNumberChecker.hasTeen(firstParam, secondParam, thirdParam);
        boolean CheckTeenFromParam = TeenNumberChecker.isTeen(secondParam);

        log.info(String.valueOf(CheckTeenFromParams));
        log.info(String.valueOf(CheckTeenFromParam));

        Assert.assertFalse(CheckTeenFromParams);
        Assert.assertFalse(CheckTeenFromParam);
    }
}
