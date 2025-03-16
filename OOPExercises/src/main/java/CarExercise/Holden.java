package CarExercise;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return String.format("%s engine is starting", Holden.class.getSimpleName());
    }

    @Override
    public String accelerate() {
        return String.format("%s is accelerating.", Holden.class.getSimpleName());
    }

    @Override
    public String brake() {
        return String.format("%s is braking.", Holden.class.getSimpleName());
    }
}
