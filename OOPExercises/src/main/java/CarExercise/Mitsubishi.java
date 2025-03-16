package CarExercise;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return String.format("%s engine is starting", Mitsubishi.class.getSimpleName());
    }

    @Override
    public String accelerate() {
        return String.format("%s is accelerating.", Mitsubishi.class.getSimpleName());
    }

    @Override
    public String brake() {
        return String.format("%s is braking.", Mitsubishi.class.getSimpleName());
    }
}
