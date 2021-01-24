package com.company;

import com.company.interfaces.IAthlete;

public class Main {

    public static void main(String[] args) {
        // Example 1
        /* Uncomment this if you need the first example
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Cat("Thomas"));
        animals.add(new Dog("Rex"));
        animals.add(new Fox("Firefox"));
        // It is not possible to instantiate an
        // object using class Animal
        // animals.add(new Animal("Unknown animal"));

        for (Animal a : animals) {
            System.out.print(a.getName() + " says ");
            a.makeSound();
        }
        */

        //Example 2

        IAthlete athlete = new JumpingSwimmer("James");

        athlete.compete();
        athlete.sayHooray();

    }

}

