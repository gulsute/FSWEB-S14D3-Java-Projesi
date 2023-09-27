package com.workintech.s14d3gulsu.pacific;

import com.workintech.s14d3gulsu.pacific.Car;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Holden's engine is starting";

    }

    @Override
    public String accelerate() {
        return "The Holden's engine is accelerating";
    }

    @Override
    public String brake() {
        return "The Holden's engine is braking";
    }
}
