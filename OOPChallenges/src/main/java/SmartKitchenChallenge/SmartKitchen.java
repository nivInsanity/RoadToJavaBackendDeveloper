package SmartKitchenChallenge;

public class SmartKitchen {
    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        System.out.println("Add water");
    }

    public void pourMilk() {
        System.out.println("Pouring milk");
    }

    public void loadDishWasher() {
        System.out.println("Loading dishwasher");
    }

    public void setKitchenState(boolean coffeState, boolean dishWasherState, boolean iceBoxState) {
        brewMaster.setHasWorkToDo(coffeState);
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(iceBoxState);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffe();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}
