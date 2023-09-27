package com.workintech.s14d3gulsu.RDCO;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCharge;
    private int batterySize;

    @Override
    public void startEngine() {
        System.out.println("The ElectricCar's engine is starting");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("The ElectricCar is driven");
    }


}
