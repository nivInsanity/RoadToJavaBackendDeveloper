import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberInWordTests {


    private static final Logger log = LoggerFactory.getLogger(NumberInWordTests.class);

    @Test
    public void checkNumberString() {
        int stringNumber = 5;
        String numberToString = NumberInWord.printNumberInWord(stringNumber);

        log.info("String of {} is {}.", stringNumber, numberToString);

        Assert.assertEquals("Wrong number.", "FIVE", numberToString);
    }
}
