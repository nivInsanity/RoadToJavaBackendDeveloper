import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegerFilterTests {

    private static final Logger log = LoggerFactory.getLogger(IntegerFilterTests.class);

    @Test
    public void checkEvenList() {
        List<Integer> evenList = IntegerFilter.getEvenInteger();

        log.info("Even numbers are: {}", evenList);

        Assert.assertTrue("List contains odd numbers", evenList.stream().allMatch(n -> n % 2 == 0));
    }
}
