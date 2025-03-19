package CarChallenge;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void baseCarClassTest() {
        Car car = new Car("Some car");

        car.runEngine();
    }

    @Test
    void hybridCarClassTest() {
        HybridCar hybridCar = new HybridCar("Toyota hybrid car", 20, 2, 4);

        hybridCar.startEngine();
        hybridCar.drive();
    }


}