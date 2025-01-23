import java.util.List;
import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConvertListToStringTests {
    private static final Logger log = LoggerFactory.getLogger(ConvertListToStringTests.class);

    @Test
    public void convertSimpleList() {
    List<Integer> integers = IntStream.rangeClosed(1, 5).boxed().toList();
    String convertedListToString = ConvertListToString.ListConverter(integers);

    log.info("Converted list to string: {}", convertedListToString);

    Assert.assertEquals("Wrong type", String.class, convertedListToString.getClass());
    }
}
