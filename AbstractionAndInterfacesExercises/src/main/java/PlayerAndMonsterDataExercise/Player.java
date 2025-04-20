package PlayerAndMonsterDataExercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(int hitPoints, int strength, String name, String weapon) {
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.name = name;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> writeDataList = new ArrayList<>();
        writeDataList.add(getName());
        writeDataList.add(Integer.toString(getHitPoints()));
        writeDataList.add(Integer.toString(getStrength()));
        writeDataList.add(getWeapon());

        return writeDataList;
    }

    @Override
    public List<String> read(List<String> valuesToRead) {
        if (valuesToRead != null && !valuesToRead.isEmpty()) {
            this.name = valuesToRead.get(0);
            this.hitPoints = Integer.parseInt(valuesToRead.get(1));
            this.strength = Integer.parseInt(valuesToRead.get(2));
            this.weapon = valuesToRead.get(3);
        }

        return List.of();
    }

    @Override
    public String toString() {
        return String.format("Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}",
                                   getName(), getHitPoints(), getStrength(), getWeapon());
    }
}
