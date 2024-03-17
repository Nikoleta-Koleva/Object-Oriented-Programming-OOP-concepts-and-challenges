package org.Inheritance_Polymorphism;

public class FerrariCar extends Car {
    private int roadServiceMonths;

    public FerrariCar(int roadServiceMonths) {
        super( "SF90 STRADALE", "AWD", 4, 2, 8, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
        } else if (newVelocity > 50 && newVelocity <= 60) {
            changeGear(6);
        } else if (newVelocity > 60 && newVelocity <= 70) {
            changeGear(7);
        } else {
            changeGear(8);
        }
    }
}
