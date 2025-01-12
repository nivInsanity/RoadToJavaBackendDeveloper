import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayingCatTests {

    private static final Logger log = LoggerFactory.getLogger(PlayingCatTests.class);

    @Test
    public void summerCatTest () {
        boolean warmSummerCatPlaying = PlayingCat.isCatPlaying(true, 36);

        log.info("Is cat playing during summer? {}", warmSummerCatPlaying);

        Assert.assertTrue(warmSummerCatPlaying);
    }

    @Test
    public void colderTemperatureCatTest () {
        boolean colderTemperatureCatPlaying = PlayingCat.isCatPlaying(false, 20);

        log.info("Is cat playing during colder temperature? {}", colderTemperatureCatPlaying);

        Assert.assertFalse(colderTemperatureCatPlaying);
    }

    @Test
    public void higherTemperatureCatTest () {
        boolean higherTemperatureCatPlaying = PlayingCat.isCatPlaying(false, 36);

        log.info("Is cat playing during hot temperature? {}", higherTemperatureCatPlaying);

        Assert.assertFalse(higherTemperatureCatPlaying);
    }

    @Test
    public void higherTemperatureSummerCatTest () {
        boolean higherTemperatureSummerCatPlaying = PlayingCat.isCatPlaying(true, 70);

        log.info("Is cat playing during hot summer temperature? {}", higherTemperatureSummerCatPlaying);

        Assert.assertFalse(higherTemperatureSummerCatPlaying);
    }

    @Test
    public void freezingTemperatureCatTest () {
        boolean freezingTemperatureCatPlaying = PlayingCat.isCatPlaying(true, -15);

        log.info("Is cat playing during freezing temperature? {}", freezingTemperatureCatPlaying);

        Assert.assertFalse(freezingTemperatureCatPlaying);
    }


}
