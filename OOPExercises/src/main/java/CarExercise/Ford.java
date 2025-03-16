package CarExercise;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return String.format("%s engine is starting", Ford.class.getSimpleName());
    }

    @Override
    public String accelerate() {
        return String.format("%s is accelerating.", Ford.class.getSimpleName());
    }

    @Override
    public String brake() {
        return String.format("%s is braking.", Ford.class.getSimpleName());
    }
}
