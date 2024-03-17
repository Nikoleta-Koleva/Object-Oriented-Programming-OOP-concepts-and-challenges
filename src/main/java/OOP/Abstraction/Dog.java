package OOP.Abstraction;

public class Dog extends AnimalClass {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(type + " lazily running");
        } else {
            System.out.println(type + "darting frantically");
        }
    }

    public void makeNoise() {
        if(type == "Wolf") {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof");
        }
    }
}
