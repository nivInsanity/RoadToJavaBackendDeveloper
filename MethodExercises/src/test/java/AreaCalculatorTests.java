import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AreaCalculatorTests {

    private static final Logger log = LoggerFactory.getLogger(AreaCalculatorTests.class);

    @Test
    public void circleArea () {
        double radiusLength = 5.0;

        double calculateCircleArea = AreaCalculator.area(radiusLength);

        log.info("Circle area is {}", calculateCircleArea);

        Assert.assertEquals(78.53981633974483, calculateCircleArea, 0.01);
    }

    @Test
    public void rectangleArea () {
        double rectangleX = 7.5;
        double rectangleY = 8.2;


        double calculateRectangleArea = AreaCalculator.area(rectangleX, rectangleY);

        log.info("Rectangle area is {}", calculateRectangleArea);

        Assert.assertEquals(61.5, calculateRectangleArea, 0.01);
    }

    @Test
    public void negativeTests () {
        double negativeRadius = -5.0;
        double negativeX = -10.0;
        double negativeY = -9.2;

        double calculateCircleArea = AreaCalculator.area(negativeRadius);
        double calculateRectangleArea = AreaCalculator.area(negativeX, negativeY);

        Assert.assertEquals(-1.0, calculateCircleArea, 0.01);
        Assert.assertEquals(-1.0, calculateRectangleArea, 0.01);
    }

}
