package com.workintech.s14d3gulsu.pacific;

import com.workintech.s14d3gulsu.pacific.Car;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Mitsubishi's engine is starting";

    }

    @Override
    public String accelerate() {
        return "The Mitsubishi's engine is accelerating";
    }

    @Override
    public String brake() {
        return "The Mitsubishi's engine is braking";
    }
}
