package com.workintech.s14d3gulsu.RDCO;

public class CarSkeleton {
    private String name;
    private String description;

    public void startEngine() {
        System.out.println("The car's engine is starting");
    }

    protected void runEngine() {
        System.out.println("The car's engine is running");
    }

    public void drive() {
        runEngine();
        System.out.println("The car is driven");
    }

}
