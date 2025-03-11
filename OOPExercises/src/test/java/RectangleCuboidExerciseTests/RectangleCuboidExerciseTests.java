package RectangleCuboidExerciseTests;

import RectangleExercise.Cuboid;
import RectangleExercise.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RectangleCuboidExerciseTests {

    private static final Logger log = LoggerFactory.getLogger(RectangleCuboidExerciseTests.class);

    @Test
    void getRectangleAreaTest() {
        Rectangle rectangle = new Rectangle(12.2, 3.4);

        log.info("Area of rectangle with width {} and length {} = {}",
                 rectangle.getWidth(), rectangle.getLength(), rectangle.getArea());

        Assertions.assertEquals(41.48, rectangle.getArea(), 0.01);
    }

    @Test
    void minusValuesRectangleTest() {
        Rectangle rectangle = new Rectangle(-5, -2.5);

        log.info("With minus values of rectangle width is set to {} and length {}",
                rectangle.getWidth(), rectangle.getLength());

        Assertions.assertEquals(0.0, rectangle.getLength(), 0.01);
        Assertions.assertEquals(0.0, rectangle.getWidth(), 0.01);
    }

    @Test
    void getCuboidVolumeTest() {
        Cuboid cuboid = new Cuboid(3, 4.2, 7.1);

        log.info("Volume of cuboid with width {}, length {} and height {} = {}",
                cuboid.getWidth(), cuboid.getLength(), cuboid.getHeight(), cuboid.getVolume());

        Assertions.assertEquals(89.46, cuboid.getVolume(), 0.01);
    }

    @Test
    void minusValuesCuboidTest() {
        Cuboid cuboid = new Cuboid(-5, -4.7, -10.4);

        log.info("With minus values of cuboid width is set to {}, length to {} and height to {}",
                cuboid.getWidth(), cuboid.getLength(), cuboid.getHeight());

        Assertions.assertEquals(0.0, cuboid.getLength(), 0.01);
        Assertions.assertEquals(0.0, cuboid.getWidth(), 0.01);
        Assertions.assertEquals(0.0, cuboid.getHeight(), 0.01);
    }
}
