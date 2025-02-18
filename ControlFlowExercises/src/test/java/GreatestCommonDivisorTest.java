import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreatestCommonDivisorTest {

    private static final Logger log = LoggerFactory.getLogger(GreatestCommonDivisorTest.class);

    @Test
    public void findCommonDivisorMaxTest() {
        int firstNumber = 12;
        int secondNumber = 24;
        int commonDivisorResult = GreatestCommonDivisor.getGreatestCommonDivisor(firstNumber, secondNumber);

        log.info("Greatest common divisor of numbers {} and {} is {}", firstNumber, secondNumber, commonDivisorResult);
    }

    @Test
    public void minusValueTest() {
        int firstNumber = -25;
        int secondNumber = 65;
        int commonDivisorResult = GreatestCommonDivisor.getGreatestCommonDivisor(firstNumber, secondNumber);

        log.info("With value below 10 result is {}", commonDivisorResult);
    }

}