import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlourPackerTest {

    private static final Logger log = LoggerFactory.getLogger(FlourPackerTest.class);

    @Test
    public void falseCountComparisonTest() {
        boolean result = FlourPacker.canPack(1, 0, 6);

        log.info("Is goal reached? {}", result);

        Assert.assertFalse(result);
    }

    @Test
    public void positiveCountComparisonTest() {
        boolean result = FlourPacker.canPack(1, 4, 6);

        log.info("Is goal reached now? {}", result);

        Assert.assertTrue(result);
    }

    @Test
    public void minusValueComparisonTest() {
        boolean result = FlourPacker.canPack(-2, 4, 7);

        log.info("With minus value result is: {}", result);

        Assert.assertFalse(result);
    }
}