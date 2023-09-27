package com.workintech.s14d3gulsu.RDCO;


public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;


    @Override
    public void startEngine() {
        System.out.println("The HybridCar's engine is starting");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("The HybridCar is driven");
    }



}
