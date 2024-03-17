package org.Composition;

public class Main {
    public static void Main (String[] args) {
        /*
        Challenge.
        Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        Finally, create another class, a specific type of Car that inherits from the Car class.
        You should be able to hand steering, changing gears, and moving (speed in other words).
        You will want to decide where to put the appropriate state and behaviours (fields and methods).
        As mentioned above, changing gears, increasing/decreasing speed should be included.
        For you specific type of vehicle you will want to add something specific for that type of car.
        */

        System.out.println("Inheritance - First task");
        FerrariCar ferrari = new FerrariCar(25);
        ferrari.accelerate(80);
        ferrari.steer(45);
        ferrari.accelerate(55);

        System.out.println("Composition training task");
        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        /*
        thePC.getMonitor().drawPixelAt(10, 10, "red");
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputerCase().pressPowerButton();
        */

        thePC.powerUp();
    }
}
