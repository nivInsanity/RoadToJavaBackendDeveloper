import main.LeapYear;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeapYearTests {

    private static final Logger log = LoggerFactory.getLogger(LeapYearTests.class);

    @Test
    public void leapYearTest() {
        int year = 2000;

        boolean isLeapYear = LeapYear.isLeapYear(year);

        log.info(String.valueOf(isLeapYear));

        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void notLeapYearTest() {
        int year = 1900;

        boolean isLeapYear = LeapYear.isLeapYear(year);

        log.info(String.valueOf(isLeapYear));

        Assert.assertFalse(isLeapYear);
    }

    @Test
    public void outOfRangeYearTest() {
        int negativeYear = -5;
        int yearAboveRange = 10000;

        boolean isLeapYearNegative = LeapYear.isLeapYear(negativeYear);
        boolean isLeapYearAboveRange = LeapYear.isLeapYear(yearAboveRange);

        log.info(String.valueOf(isLeapYearNegative));
        log.info(String.valueOf(isLeapYearAboveRange));

        Assert.assertFalse(isLeapYearNegative);
        Assert.assertFalse(isLeapYearAboveRange);
    }
}
