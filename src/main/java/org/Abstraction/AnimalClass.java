package org.Abstraction;

abstract class Mammal extends AnimalClass {
    public Mammal (String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed) {
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}

public abstract class AnimalClass {
    protected String type;
    private String size;
    private double weight;

    public AnimalClass(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    //Abstract methods can't be private and must be empty
    public abstract void move(String speed);

    public abstract void makeNoise();

    public String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
