import interfaces.Vehicle;
import model.Bicycle;
import model.Car;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VehiclesTests {

    private static final Logger log = LoggerFactory.getLogger(VehiclesTests.class);

    @Test
    public void CarTest() {
        Vehicle car = new Car();

        log.info("Status of the car: {}", car.start());

        Assert.assertEquals("Car started.", car.start());
    }

    @Test
    public void BicycleTest() {
        Vehicle bicycle = new Bicycle();

        log.info("Status of the bicycle: {}", bicycle.start());

        Assert.assertNotEquals("Vehicle moved.", bicycle.start());
    }

}
