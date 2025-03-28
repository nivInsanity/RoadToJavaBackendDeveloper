import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondsAndMinutesChallengeTests {

    private static final Logger log = LoggerFactory.getLogger(SecondsAndMinutesChallengeTests.class);

    @Test
    public void convertToMinutesTest () {
        String timeInMinutes = SecondsAndMinutesChallenge.getDurationString(1801);

        log.info("Converted seconds to minutes is {}", timeInMinutes);
    }

    @Test
    public void convertToHoursTest () {
        String fullTimeFormat = SecondsAndMinutesChallenge.getDurationString(40, 70);
        log.info("Converted minutes and seconds to full time format is {}", fullTimeFormat);
    }
}
