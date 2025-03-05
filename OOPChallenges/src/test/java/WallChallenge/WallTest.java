package WallChallenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WallTest {

    @Test
    void countNormalWall() {
        Wall wall = new Wall(34.5, 24.2);
        assertEquals(834.9, wall.getArea(), 0.01);
    }

    @Test
    void minusValues() {
        Wall wall = new Wall(-20, -54.2);
        assertEquals(0, wall.getHeight());
        assertEquals(0, wall.getWidth());
    }
}