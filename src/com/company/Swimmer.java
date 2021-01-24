package com.company;

import com.company.interfaces.ISwimmingAthlete;

public abstract class Swimmer extends Athlete implements ISwimmingAthlete {

    public Swimmer(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Started swimming");
    }
}


