package CarChallenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void drive() {
        System.out.printf("%s is driving.%n", getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is running.");
    }
}
