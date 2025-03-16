package CarExercise;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return String.format("%s engine is starting", Car.class.getSimpleName());
    }

    public String accelerate() {
        return String.format("%s is accelerating.", Car.class.getSimpleName());
    }

    public String brake() {
        return String.format("%s is braking.", Car.class.getSimpleName());
    }

}
