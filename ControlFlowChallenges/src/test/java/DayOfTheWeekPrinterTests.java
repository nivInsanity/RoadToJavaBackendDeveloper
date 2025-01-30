import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DayOfTheWeekPrinterTests {
    private static final Logger log = LoggerFactory.getLogger(DayOfTheWeekPrinterTests.class);

    @Test
    public void printDayOfWeekSwitchTest() {
        int dayNumber = 4;
        String dayOfTheWeek = DayOfTheWeekPrinter.printDayOfWeek(dayNumber);

        log.info("Day {} of the week in enhanced switch method is {}", dayNumber, dayOfTheWeek);

        Assert.assertEquals("Day of the week is wrong!", "Thursday", dayOfTheWeek);
    }

    @Test
    public void printDayOfWeekIfTest() {
        int dayNumber = 6;
        String dayOfTheWeek = DayOfTheWeekPrinter.printWeekDay(dayNumber);

        log.info("Day {} of the week in if else method is {}", dayNumber, dayOfTheWeek);

        Assert.assertEquals("Day of the week is wrong!", "Saturday", dayOfTheWeek);
    }

    @Test
    public void printDayOfWeekNegativeTest() {
        int dayNumber = 0;
        String dayOfTheWeek = DayOfTheWeekPrinter.printDayOfWeek(dayNumber);

        log.info("Day {} is not Monday.", dayNumber);

        Assert.assertNotEquals("Day of the week is wrong!", "Monday", dayOfTheWeek);
    }
}
