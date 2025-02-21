package SimpleCalculatorChallenge;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleCalculatorTest {

    private static final Logger log = LoggerFactory.getLogger(SimpleCalculatorTest.class);

    @Test
    public void additionTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(12.5);
        simpleCalculator.setSecondNumber(13.5);
        double result = simpleCalculator.getAdditionResult();

        log.info("Result of addition is: {}", result);

        Assert.assertEquals(26.0, result, 0.01);
    }

    @Test
    public void subtractionTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(6);
        simpleCalculator.setSecondNumber(3.5);
        double result = simpleCalculator.getSubtractionResult();

        log.info("Result of subtraction is: {}", result);

        Assert.assertEquals(2.5, result, 0.01);
    }

    @Test
    public void multiplicationTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(2.25);
        simpleCalculator.setSecondNumber(4.15);
        double result = simpleCalculator.getMultiplicationResult();

        log.info("Result of multiplication is: {}", result);

        Assert.assertEquals(9.3375, result, 0.00001);
    }

    @Test
    public void divisionTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(1.5);
        simpleCalculator.setSecondNumber(10.05);
        double result = simpleCalculator.getDivisionResult();

        BigDecimal bdResult = new BigDecimal(result);
        BigDecimal bdResultRounded = bdResult.setScale(4, RoundingMode.DOWN);


        log.info("Result of division is: {}", bdResultRounded);

        Assert.assertEquals(0.1492, bdResultRounded.doubleValue(), 0.00001);
    }

    @Test
    public void divisionMinusTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(1.5);
        simpleCalculator.setSecondNumber(-10.05);
        double result = simpleCalculator.getDivisionResult();

        BigDecimal bdResult = new BigDecimal(result);
        BigDecimal bdResultRounded = bdResult.setScale(4, RoundingMode.DOWN);


        log.info("Result of division is: {}", bdResultRounded);

        Assert.assertNotEquals(0.1492, bdResultRounded.doubleValue(), 0.00001);
    }
}