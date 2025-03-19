package CarExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void carClassTest() {
        Car car =  new Car(4, "Car");

        Assertions.assertEquals("Car engine is starting", car.startEngine());
    }

    @Test
    void holdenClassTest() {
        Holden holden = new Holden(6, "Commodore");

        Assertions.assertEquals("Holden is braking.", holden.brake());
    }
}