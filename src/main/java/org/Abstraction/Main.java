package org.Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Can't create an instance of an abstract class
        //AnimalAbstraction animalClass = new AnimalClass();

        Dog wolf = new Dog("Wolf", "big", 100);
        Horse horse = new Horse("Clyvesdale", "large", 1000);
        wolf.makeNoise();

        doAnimalStuff(wolf);

        ArrayList animals = new ArrayList<>();
        animals.add(wolf);
        animals.add(horse);

        for (Object a : animals) {
            doAnimalStuff((AnimalClass) a);
        }

        Bird bird = new Bird();
        AnimalInterface animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        /*
        flier.move();
        tracked.move();
        */

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
    private static void doAnimalStuff(AnimalClass animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}