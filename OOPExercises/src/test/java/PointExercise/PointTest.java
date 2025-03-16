package PointExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PointTest {

    private static final Logger log = LoggerFactory.getLogger(PointTest.class);

    @Test
    void testEmptyConstructor() {
        Point point = new Point();
        log.info("For empty constructor point X is: {}, point Y is {}.", point.getX(), point.getY());

        Assertions.assertEquals(0, point.getX());
        Assertions.assertEquals(0, point.getY());
    }

    @Test
    void testDistanceFromOrigin() {
        Point point = new Point(3, 4);
        double expectedDistance = 5.0;
        double actualDistance = point.distance();
        log.info("Testing distance from origin for point (3, 4) - Expected: {}, Actual: {}", expectedDistance, actualDistance);
        Assertions.assertEquals(expectedDistance, actualDistance, "Distance from origin should be 5.0");
    }

    @Test
    void testDistanceBetweenTwoPoints() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(4, 5);
        double expectedDistance = 5.0;
        double actualDistance = point1.distance(point2);
        log.info("Testing distance between points (1, 1) and (4, 5) - Expected: {}, Actual: {}", expectedDistance, actualDistance);
        Assertions.assertEquals(expectedDistance, actualDistance, "Distance between points should be 5.0");
    }
}