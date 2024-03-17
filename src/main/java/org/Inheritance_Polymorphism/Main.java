package org.Inheritance_Polymorphism;
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
    }
}