import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FindHighestValueTests {

    private static final Logger log = LoggerFactory.getLogger(FindHighestValueTests.class);

    @Test
    public void findHighestValueTest() {
        List<Integer> randomizedIntegers = new ArrayList<>(List.of(3, 10, 20, 4, 8));
        int highestInteger = FindHighestValue.highestValue(randomizedIntegers);

        log.info("Highest value from list is: {}", highestInteger);

        Assert.assertEquals("Highest value different than expected!", 20, highestInteger);


    }
}
