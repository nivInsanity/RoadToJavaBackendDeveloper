import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckPrimeNumberTests {

    private static final Logger log = LoggerFactory.getLogger(CheckPrimeNumberTests.class);

    @Test
    public void forLoopChallengeTest() {
        int primeCounter = 0;

        for (int primeRange = 1; primeRange <= 1000; primeRange++) {
            if (CheckPrimeNumber.isPrime(primeRange)) {
                primeCounter+=1;
            }
        }
        
        log.info(String.valueOf(primeCounter));

        Assert.assertEquals(168, primeCounter);
    }
}
