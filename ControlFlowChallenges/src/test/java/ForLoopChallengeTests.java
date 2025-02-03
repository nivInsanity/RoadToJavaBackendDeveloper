import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForLoopChallengeTests {
    private static final Logger log = LoggerFactory.getLogger(ForLoopChallengeTests.class);

    @Test
    public void quarterRiseForLoopTest() {
        int amount = 100;
        int loopCounter = 1;

        for (double interestRate = 7.5; interestRate <= 10.0; interestRate += 0.25) {
            double calculatedInterest = ForLoopChallenge.calculateInterest(amount, interestRate);

            loopCounter+=1;

            log.info("For iteration {} = {} of calculated interest.", loopCounter, calculatedInterest);
        }
    }
}
