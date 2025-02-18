import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorPrinterTest {
    private static final Logger log = LoggerFactory.getLogger(FactorPrinterTest.class);

    @Test
    public void checkForFactorsTest() {
        int number = 15;
        ArrayList<Integer> factorsList = FactorPrinter.printFactors(number);
        List<Integer> expectedFactors = new ArrayList<>(Arrays.asList(1, 3, 5, 15));

        log.info("Factors of {} are {}", number, factorsList);

        Assert.assertEquals(expectedFactors, factorsList);
    }

    @Test
    public void checkForNegativeTest() {
        int number = -5;
        ArrayList<Integer> factorsList = FactorPrinter.printFactors(number);
        List<Integer> expectedFactors = new ArrayList<>(List.of(-1));

        log.info("With negative number result is {}", factorsList);

        Assert.assertEquals(expectedFactors, factorsList);
    }
}