import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SharedDigitTest {
    private static final Logger log = LoggerFactory.getLogger(SharedDigitTest.class);

    @Test
    public void CheckForSharedDigitTest() {
        int firstNumber = 14554702;
        int secondNumber = 12;
        boolean checkResult = SharedDigit.hasSharedDigit(firstNumber, secondNumber);

        log.info("Has {} and {} shared digit? {}", firstNumber, secondNumber, checkResult);
    }
}