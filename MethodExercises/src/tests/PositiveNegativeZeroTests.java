package tests;
import main.PositiveNegativeZero;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;


public class PositiveNegativeZeroTests {

    private static final Logger log = LoggerFactory.getLogger(PositiveNegativeZeroTests.class);

    @Test
    public void positiveTest () {

        String positive = PositiveNegativeZero.checkNumber(10);

        log.info("The value of positiveTest is: {}", positive);
        assertEquals("positive", positive);
    }
    @Test
    public void negativeTest () {

        String negative = PositiveNegativeZero.checkNumber(-5);

        log.info("The value of negativeTest is: {}", negative);
        assertEquals("negative", negative);
    }
    @Test
    public void zeroTest () {

        String zero = PositiveNegativeZero.checkNumber(0);

        log.info("The value of zeroTest is: {}", zero);
        assertEquals(zero, zero);
    }
}
