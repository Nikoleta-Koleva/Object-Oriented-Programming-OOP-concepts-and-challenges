package OOP.Inheritance_Polymorphism;

/*
This keyword and instance/field variables can't be used in static methods
Main is a static method and is called by the JVM when it starts an application
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance - Training task");
        //Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        dog.eat();
        dog.walk();
        dog.run();

        /*
        Challenge.
        Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        Finally, create another class, a specific type of Car that inherits from the Car class.
        You should be able to hand steering, changing gears, and moving (speed in other words).
        You will want to decide where to put the appropriate state and behaviours (fields and methods).
        As mentioned above, changing gears, increasing/decreasing speed should be included.
        For you specific type of vehicle you will want to add something specific for that type of car.
        */

        System.out.println("Inheritance - Challenge");
        FerrariCar ferrari = new FerrariCar(25);
        ferrari.accelerate(80);
        ferrari.steer(45);
        ferrari.accelerate(55);
    }
}