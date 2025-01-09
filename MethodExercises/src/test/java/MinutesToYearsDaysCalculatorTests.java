import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinutesToYearsDaysCalculatorTests {
    private static final Logger log = LoggerFactory.getLogger(MinutesToYearsDaysCalculatorTests.class);

    @Test
    public void ConvertMinutesToYearsAndDaysTest () {
        String calculatedTime = MinutesToYearsDaysCalculator.printYearsAndDays(525600);

        log.info(calculatedTime);

        Assert.assertEquals("525600 min = 1 y and 0 d", calculatedTime);
    }

    @Test
    public void negativeValuesConvertTest () {
        String negativeCalculatedTime = MinutesToYearsDaysCalculator.printYearsAndDays(-12455);

        log.info(negativeCalculatedTime);

        Assert.assertEquals("Invalid Value", negativeCalculatedTime);
    }

}
