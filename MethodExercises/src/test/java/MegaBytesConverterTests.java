import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MegaBytesConverterTests {

    private static final Logger log = LoggerFactory.getLogger(MegaBytesConverterTests.class);

    @Test
    public void simpleConvertTest () {

        int kiloBytes = 21374;
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;

        String conversionMethodMessage = MegaBytesConverter.printMegaBytesAndKiloBytes(kiloBytes);
        String expectedMessage = String.format("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainingKiloBytes);

        log.info(conversionMethodMessage);

        Assert.assertEquals(expectedMessage, conversionMethodMessage);
    }

    @Test
    public void negativeConvertTest () {
        int kiloBytes = -1252152512;

        String expectedMessage = "Invalid Value";
        String conversionMethodMessage = MegaBytesConverter.printMegaBytesAndKiloBytes(kiloBytes);

        log.info(conversionMethodMessage);

        Assert.assertEquals(expectedMessage, conversionMethodMessage);
    }
}
