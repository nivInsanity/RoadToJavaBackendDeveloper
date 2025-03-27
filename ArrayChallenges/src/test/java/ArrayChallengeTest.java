import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ArrayChallengeTest {

    private static final Logger log = LoggerFactory.getLogger(ArrayChallengeTest.class);

    @Test
    void checkOutputArrayTest() {
        Integer[] newInt = ArrayChallenge.sortRandomlyGeneratedArray(10);

        for(Integer element : newInt) {
            log.info(String.valueOf(element));
        }
    }
}