package com.company;

import com.company.interfaces.IVehicle;

public class UsualCar extends Car implements IVehicle {

    public UsualCar(int horsePower) {
        super(horsePower);
    }

    @Override
    public void move() {
        System.out.println("Hooray! We are moving!");
    }

    @Override
    public void stop() {
        System.out.println("Thanks God, we stopped!");
    }
}
