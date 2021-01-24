package com.company;

import com.company.interfaces.IAthlete;

public abstract class Athlete implements IAthlete {
    public String name;

    public Athlete(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHooray() {
        System.out.println("Hooray!");
    }
}

