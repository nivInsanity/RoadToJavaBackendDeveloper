import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ArrayReverseExerciseTest {
    private static final Logger log = LoggerFactory.getLogger(ArrayReverseExerciseTest.class);

    @Test
    void reverseArrayTest() {
        int[] arrayToReverse = {1,2,3,4,5};
        String reversedArray = ArrayReverseExercise.reverse(arrayToReverse);

        log.info("Reversed array: {}", reversedArray);

        Assertions.assertEquals("[5, 4, 3, 2, 1]", reversedArray);
    }
}