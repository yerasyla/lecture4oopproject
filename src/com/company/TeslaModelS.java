package com.company;

import com.company.interfaces.ILuxuryCar;

public class TeslaModelS extends Car implements ILuxuryCar {
    private static final int maxSpeed = 300;

    public TeslaModelS(int horsePower) {
        super(horsePower);
    }


    @Override
    public void autoPilot() {
        System.out.println("The car is in the auto pilot mode..");
    }

    @Override
    public void turnOnConditioner() {
        System.out.println("Air con was turned on..");
    }

    @Override
    public void turnOffConditioner() {
        System.out.println("Air con was turned off..");
    }

    @Override
    public void move() {
        System.out.println("The car is moving with max speed " + maxSpeed);
    }

    @Override
    public void stop() {
        System.out.println("The car stopped..");
    }
}
