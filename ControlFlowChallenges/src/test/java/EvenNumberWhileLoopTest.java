import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EvenNumberWhileLoopTest {

    private static final Logger log = LoggerFactory.getLogger(EvenNumberWhileLoopTest.class);

    @Test
    //Test used instead of main method, no assertions
    public void evenWhileLoopTest() {
        int number = 5;
        int evenCounter = 0;

        while (number < 20) {
            boolean isEven = EvenNumberWhileLoop.isEvenNumber(number);

            if (!isEven) {
                number++;
                continue;
            } else {
                evenCounter+=1;

                if (evenCounter > 5) {
                    break;
                }

                log.info("Even numbers found: {}", evenCounter);
                log.info("Even value found: {}", number);
            }
            number++;
        }
    }
}