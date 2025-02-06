package model;

import interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public String start() {
        return "Car started.";
    }
}
