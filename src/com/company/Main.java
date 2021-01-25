package com.company;

import com.company.interfaces.IVehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IVehicle> cars = new ArrayList<>();

        cars.add(new UsualCar(50));
        cars.add(new TeslaModelS(700));

        for (IVehicle car : cars) {
            car.move();
        }

        System.out.println("--------------------");
        for (IVehicle car : cars) {
            car.stop();
        }

    }


    public static void forceAnimalSay(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            System.out.print(animal.getName());
            System.out.print(" says ");
            animal.makeSound();
        }
    }

}

