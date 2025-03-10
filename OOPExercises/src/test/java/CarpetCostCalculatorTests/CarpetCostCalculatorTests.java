package CarpetCostCalculatorTests;

import CarpetCostCalculator.Calculator;
import CarpetCostCalculator.Carpet;
import CarpetCostCalculator.Floor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarpetCostCalculatorTests {

    private static final Logger log = LoggerFactory.getLogger(CarpetCostCalculatorTests.class);

    @Test
    void negativeValuesFloorTest() {
        Floor floor = new Floor(-5, -20);

        log.info("Area of the floor with negative values = {}", floor.getArea());

        Assertions.assertNotEquals(100, floor.getArea());
    }

    @Test
    void negativeValuesCarpetTest() {
        Carpet carpet = new Carpet(-20.5);

        log.info("Cost of the floor with negative value = {}", carpet.getCost());

        Assertions.assertNotEquals(-20.5, carpet.getCost());
    }

    @Test
    void calculateCarpetTest() {
        Floor floor = new Floor(2, 1.6);
        Carpet carpet = new Carpet(11.5);
        Calculator calculator = new Calculator(floor, carpet);

        log.info("Calculated cost for floor to cover with carpet = {}", calculator.getTotalCost());

        Assertions.assertEquals(36.8, calculator.getTotalCost(), 0.01);
    }

}
