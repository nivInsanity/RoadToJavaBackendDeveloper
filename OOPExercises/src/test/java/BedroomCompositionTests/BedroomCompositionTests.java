package BedroomCompositionTests;

import BedroomCompositionExercise.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BedroomCompositionTests {

    private static final Logger log = LoggerFactory.getLogger(BedroomCompositionTests.class);

    @Test
    void lampTest() {
        Lamp lamp = new Lamp("Classic", true, 5);

        Assertions.assertEquals("Lamp -> Turning on", lamp.turnOn());
    }

    @Test
    void bedTest() {
        Bed bed = new Bed("Loft", 2, 40, 1, 1);

        Assertions.assertEquals("Bed -> Making | ", bed.make());
    }

    @Test
    void bedroomTest() {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(220, 3);
        Bed bed = new Bed("Loft", 2, 40, 1, 1);
        Lamp lamp = new Lamp("Classic", false, 5);
        Bedroom bedroom = new Bedroom("My bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        Assertions.assertEquals("Bed -> Making | ", bedroom.makeBed());
    }
}
