import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OldNatoAlphabetTranslatorTests {

    private static final Logger log = LoggerFactory.getLogger(OldNatoAlphabetTranslatorTests.class);

    @Test
    public void TestOneLetter() {
        char letterForTest = 'A';
        String methodResult = OldNatoAlphabetTranslator.translateLetterToWord(letterForTest);

        log.info("Translated letter {} to Old NATO Alphabet is {}", letterForTest, methodResult);

        Assert.assertEquals("Wrong word!", "Able", methodResult);
    }
}
