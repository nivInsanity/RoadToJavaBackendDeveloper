import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SpeedConverterTests {

    private static final Logger log = LoggerFactory.getLogger(SpeedConverterTests.class);

    @Test
    public void toMilesPerHourTest () {
        long convertedValue = SpeedConverter.toMilesPerHour(75.114);

        log.info(String.valueOf(convertedValue));

        Assert.assertEquals(47, convertedValue);
    }

    @Test
    public void toMilesPerHourNegativeTest () {
        long convertedValue = SpeedConverter.toMilesPerHour(-5.6);

        log.info(String.valueOf(convertedValue));

        Assert.assertEquals(-1, convertedValue);
    }

    @Test
    public void printConversionTest () {
        double kilometersPerHour = 25.32;
        double convertedValue = SpeedConverter.toMilesPerHour(kilometersPerHour);

        String expectedMessage = String.format("%.2f km/h = %.2f mi/h", kilometersPerHour, convertedValue);

        String message = SpeedConverter.printConversion(kilometersPerHour);
        log.info(message);

        Assert.assertEquals(expectedMessage, message);
    }

    @Test
    public void printConversionNegativeTest () {
        double kilometersPerHour = -1.21512;

        String expectedMessage = "Invalid Value";

        String message = SpeedConverter.printConversion(kilometersPerHour);
        log.info(message);

        Assert.assertEquals(expectedMessage, message);
    }

}
