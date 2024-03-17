package org.Encapsulation;

public class Car {
    /*
    public, private, protected
    public - unrestricted access to the class
    private - no other class can access the class
    protected - classes in the same package can access the class
    */

    //class fields/variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            //this keyword - updates the parameter of the class
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
