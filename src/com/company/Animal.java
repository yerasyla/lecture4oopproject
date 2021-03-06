package com.company;

import com.company.interfaces.IAnimal;

public abstract class Animal implements IAnimal {

    private String name;

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
