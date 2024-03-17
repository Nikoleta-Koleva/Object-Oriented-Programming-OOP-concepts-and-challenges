package org.Abstraction;

public abstract class AnimalInterface {
    public abstract void move();
}

interface FlightEnabled {
    void takeOff();
    void land();
    void fly();
}

interface Trackable {
    void track();
}
