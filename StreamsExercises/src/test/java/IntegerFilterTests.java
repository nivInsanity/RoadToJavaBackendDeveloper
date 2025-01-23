import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegerFilterTests {

    private static final Logger log = LoggerFactory.getLogger(IntegerFilterTests.class);

    @Test
    public void checkEvenList() {
        List<Integer> integers = IntStream.rangeClosed(1, 20).boxed().toList();

        List<Integer> evenList = IntegerFilter.getEvenInteger(integers);

        log.info("Even numbers are: {}", evenList);

        Assert.assertTrue("List contains odd numbers", evenList.stream().allMatch(n -> n % 2 == 0));
    }
}
