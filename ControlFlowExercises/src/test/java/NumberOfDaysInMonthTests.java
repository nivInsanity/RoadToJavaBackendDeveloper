import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberOfDaysInMonthTests {

    private static final Logger log = LoggerFactory.getLogger(NumberOfDaysInMonthTests.class);

    @Test
    public void checkFebruaryNotLeapYear() {
        int checkHowManyDays = NumberOfDaysInMonth.getDaysInMonth(2, 1991);

        log.info("Februrary in 1991 year has {} days", checkHowManyDays);

        Assert.assertEquals(28, checkHowManyDays);
    }

    @Test
    public void checkFebruaryLeapYear() {
        int checkHowManyDays = NumberOfDaysInMonth.getDaysInMonth(2, 2000);

        log.info("Februrary in 2000 year has {} days", checkHowManyDays);

        Assert.assertEquals(29, checkHowManyDays);
    }

    @Test
    public void checkOutOfRangeMonth() {
        int checkHowManyDays = NumberOfDaysInMonth.getDaysInMonth(-1, 1997);

        log.info("-1 is not a month.");

        Assert.assertNotEquals(31, checkHowManyDays);
    }

    @Test
    public void checkOutOfRangeYear() {
        int checkHowManyDays = NumberOfDaysInMonth.getDaysInMonth(3, 100000);

        log.info("Year value out of range.");

        Assert.assertNotEquals(31, checkHowManyDays);
    }
}
