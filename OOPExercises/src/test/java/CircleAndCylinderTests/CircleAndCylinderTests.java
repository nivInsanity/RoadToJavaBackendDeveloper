package CircleAndCylinderTests;

import CircleInheritanceExercise.Circle;
import CircleInheritanceExercise.Cylinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CircleAndCylinderTests {

    private static final Logger log = LoggerFactory.getLogger(CircleAndCylinderTests.class);

    @Test
    void getAreaCircleTest() {
        Circle circle = new Circle(3.42);

        log.info("Area of circle with radius {} is: {}", circle.getRadius(), circle.getArea());

        Assertions.assertEquals(Math.pow(circle.getRadius(), 2) * Math.PI, circle.getArea());
    }

    @Test
    void getCylinderVolumeTest() {
        Cylinder cylinder = new Cylinder(2.56, 14);

        log.info("Area of cylinder with radius {} and height {} is: {}", cylinder.getRadius(),cylinder.getHeight(),
                                                                                               cylinder.getArea());

        Assertions.assertEquals(Math.pow(cylinder.getRadius(), 2) * Math.PI * cylinder.getHeight(),
                                                                                         cylinder.getVolume());
    }

    @Test
    void getCircleAreaWithMinusValuesTest() {
        Circle circle = new Circle(-1.2137);

        log.info("Area of circle with minus radius {} is: {}", circle.getRadius(), circle.getArea());

        Assertions.assertEquals(Math.pow(circle.getRadius(), 2) * Math.PI, circle.getArea());

    }

}
