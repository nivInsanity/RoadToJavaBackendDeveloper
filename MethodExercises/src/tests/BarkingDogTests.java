package tests;

import main.BarkingDog;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarkingDogTests {
    private static final Logger log = LoggerFactory.getLogger(BarkingDogTests.class);

    @Test
    public void beforeEightTest () {
        int currentHour = 6;

        boolean barking = true;
        boolean isDogBarking = BarkingDog.shouldWakeUp(barking, currentHour);

        log.info(String.valueOf(isDogBarking));

        Assert.assertTrue(isDogBarking);
    }

    @Test
    public void noonTimeTest () {
        int currentHour = 12;

        boolean barking = false;
        boolean isDogBarking = BarkingDog.shouldWakeUp(barking, currentHour);

        log.info(String.valueOf(isDogBarking));

        Assert.assertFalse(isDogBarking);
    }

    @Test
    public void nightTest () {
        int currentHour = 23;

        boolean barking = true;
        boolean isDogBarking = BarkingDog.shouldWakeUp(barking, currentHour);

        log.info(String.valueOf(isDogBarking));

        Assert.assertTrue(isDogBarking);
    }

    @Test
    public void negativeTest () {
        int negativeHour = -5;
        int nonExistentHour = 45;

        boolean barking = false;
        boolean isDogBarkingOnNegativeHour = BarkingDog.shouldWakeUp(barking, negativeHour);
        boolean isDogBarkingNonExistentHour = BarkingDog.shouldWakeUp(barking, nonExistentHour);

        log.info(String.valueOf(isDogBarkingOnNegativeHour));
        log.info(String.valueOf(isDogBarkingNonExistentHour));

        Assert.assertFalse(isDogBarkingOnNegativeHour);
        Assert.assertFalse(isDogBarkingNonExistentHour);
    }

}
