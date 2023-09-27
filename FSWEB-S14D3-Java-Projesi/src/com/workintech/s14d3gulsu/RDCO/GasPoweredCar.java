package com.workintech.s14d3gulsu.RDCO;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int cylinders;



    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }


    @Override
    public void startEngine() {
        System.out.println("The GasPoweredCar's engine is starting");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("The GasPoweredCar is driven");
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                '}';
    }
}
