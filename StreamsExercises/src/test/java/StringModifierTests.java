import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringModifierTests {

    private static final Logger log = LoggerFactory.getLogger(StringModifierTests.class);

    @Test
    public void ModifyStringTest() {
        List<String> strings = new ArrayList<>(List.of("Anna", "Adam", "Alex"));
        List<String> modifiedStrings = StringModifier.modifyStringToUpperCase(strings);

        log.info("Modified strings are: {}",modifiedStrings);

        List<String> expectedString = new ArrayList<>(List.of("ANNA", "ADAM", "ALEX"));
        Assert.assertEquals("Lists are not equal!", expectedString, modifiedStrings);
    }
}
