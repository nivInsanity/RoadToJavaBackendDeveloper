import java.util.List;
import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumOfSquaresFromListTests {
    private static final Logger log = LoggerFactory.getLogger(SumOfSquaresFromListTests.class);

    @Test
    public void SquareExampleValuesTest() {
        List<Integer> integers = IntStream.rangeClosed(1, 4).boxed().toList();
        int sumOfSquaredIntegers = SumOfSquaresFromList.squareIntegers(integers);

        log.info("Sum of squared integers are: {}", sumOfSquaredIntegers);

        Assert.assertEquals("Wrong values on list!", 30, sumOfSquaredIntegers);
    }
}
