import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodOverloadingExerciseTests {

    private static final Logger log = LoggerFactory.getLogger(MethodOverloadingExerciseTests.class);

    @Test
    public void convertToCentimetersTest () {
        int inchesHeight = 12;
        double convertedValue = MethodOverloadingExercise.convertToCentimeters(inchesHeight);

        log.info("Converted value is {}", convertedValue);

        Assert.assertEquals("Value is incorrect.",30.48, convertedValue, 0.001);
    }

    @Test
    public void convertFeetToInchesAndToCentimetersTest () {
        int feetHeight = 9;
        int inchesHeight = 13;

        double convertedValue = MethodOverloadingExercise.convertToCentimeters(feetHeight, inchesHeight);

        log.info("Converted value from second test is {}", convertedValue);

        Assert.assertEquals("Value is incorrect.", 307.34, convertedValue, 0.001);

    }

}
