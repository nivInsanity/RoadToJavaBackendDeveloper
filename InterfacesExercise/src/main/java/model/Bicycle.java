package model;

import interfaces.Vehicle;

public class Bicycle implements Vehicle {
    @Override
    public String start() {
        return "Bicycle moved.";
    }
}
