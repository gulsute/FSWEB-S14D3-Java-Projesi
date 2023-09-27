package com.workintech.s14d3gulsu.pacific;

import com.workintech.s14d3gulsu.pacific.Car;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Ford's engine is starting";

    }

    @Override
    public String accelerate() {
        return "The Ford's engine is accelerating";
    }

    @Override
    public String brake() {
        return "The Ford's engine is braking";
    }
}
